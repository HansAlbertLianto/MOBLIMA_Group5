package file_manager;
import java.util.*;
import java.io.Serializable;

public class Index implements Serializable{
	private int indexMovie;
	private int indexCineplex;
	private int indexCinemaMovie;
	public Index(int indexMovie, int indexCineplex, int indexCinemaMovie){
		this.indexMovie = indexMovie;
		this.indexCineplex = indexCineplex;
		this.indexCinemaMovie = indexCinemaMovie;
	}
	public int getIndexMovie() {
		return indexMovie;
	}
	public void setIndexMovie(int indexMovie) {
		this.indexMovie = indexMovie;
	}
	public int getIndexCineplex() {
		return indexCineplex;
	}
	public void setIndexCineplex(int indexCineplex) {
		this.indexCineplex = indexCineplex;
	}
	public int getIndexCinemaMovie() {
		return indexCinemaMovie;
	}
	public void setIndexCinemaMovie(int indexCinemaMovie) {
		this.indexCinemaMovie = indexCinemaMovie;
	}

	public void updateIndex(int type){
		//System.out.println(index.getIndexMovie());
		if (type==0){
			this.indexMovie++;
		}
		else if (type == 1){
			this.indexCineplex++;
		}
		else if (type == 2){
			this.indexCinemaMovie++;
		}
		FileManager.writeSerializedObject(PathManager.getBaseIndexFilePath(), this);
	}
	
}
