package model.index;
import file_manager.FileManager;
import file_manager.PathManager;

import java.io.File;
import java.io.Serializable;

public class Index implements Serializable{
	private int indexMovie;
	private int indexCineplex;
	private int indexPerson;

    private static Index singleton = null;

    private Index() {
        this.indexMovie = 0;
        this.indexCineplex = 0;
        this.indexPerson = 0;
    }

    public static Index getInstance() {
        if (singleton == null) singleton = loadIndex();
        return singleton;
    }

	public Index(int indexMovie, int indexCineplex, int indexCinemaMovie, int indexCinema, int indexReview, int indexSeat, int indexSeatLayout, int indexPerson){
		this.indexMovie = indexMovie;
		this.indexCineplex = indexCineplex;
		this.indexPerson = indexPerson;
	}
	public int getIndexMovie() {
		return indexMovie;
	}

	public int getIndexCineplex() {
		return indexCineplex;
	}

    public int getIndexPerson() {
        return indexPerson;
    }

    public void updateIndex(UpdateIndexType x){
		//System.out.println(index.getIndexMovie());
		switch (x){
			case UPDATE_MOVIE : this.indexMovie++; break;
			case UPDATE_CINEPLEX : this.indexCineplex++;
			case UPDATE_PERSON : this.indexPerson++; break;
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
