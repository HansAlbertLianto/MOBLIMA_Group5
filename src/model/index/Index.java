package model.index;
import file_manager.FileManager;

import java.io.Serializable;

public class Index implements Serializable{
	private int indexMovie;
	private int indexCineplex;
	private int indexUser;

    private static Index singleton = null;

    private Index() {
        this.indexMovie = 0;
        this.indexCineplex = 0;
        this.indexUser = 0;
    }

    public static Index getInstance() {
        if (singleton == null) singleton = loadIndex();
        return singleton;
    }

	public Index(int indexMovie, int indexCineplex, int indexCinemaMovie, int indexCinema, int indexReview, int indexSeat, int indexSeatLayout, int indexUser){
		this.indexMovie = indexMovie;
		this.indexCineplex = indexCineplex;
		this.indexUser = indexUser;
	}
	public int getIndexMovie() {
		return indexMovie;
	}

	public int getIndexCineplex() {
		return indexCineplex;
	}

    public int getIndexUser() {
        return indexUser;
    }

    public void updateIndex(UpdateIndexType x){
		//System.out.println(index.getIndexMovie());
		switch (x){
			case UPDATE_MOVIE : this.indexMovie++; break;
			case UPDATE_CINEPLEX : this.indexCineplex++;
			case UPDATE_USER: this.indexUser++; break;
		}
		save();
	}

	private void save(){
        FileManager.getInstance().saveIndexFile(this);
    }

	public static Index loadIndex(){
        Index index = FileManager.getInstance().loadIndexFile();
        if(index == null){
            index = new Index();
            FileManager.getInstance().saveIndexFile(index);
        }
        return index;
    }
	
}
