package buaa.swf.vo;



import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FilmInfo  implements Parcelable{
	 public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getStarring() {
		return starring;
	}
	public void setStarring(String starring) {
		this.starring = starring;
	}
	public String getProduce() {
		return produce;
	}
	public void setProduce(String produce) {
		this.produce = produce;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getActionTime() {
		return actionTime;
	}
	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	private String filmName;
	    private String director;
	    private String starring;
	    private String produce;
	    private String summary;
	    private String actionTime;
	    private String imgUrl;
		@Override
		public int describeContents() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public void writeToParcel(Parcel dest, int flags) {
	        // 按顺序写 否则数据错位
	        dest.writeString(filmName);
	        dest.writeString(director);
	        dest.writeString(starring);
	        dest.writeString(produce);
	        dest.writeString(summary);
	        dest.writeString(actionTime);
	        dest.writeString(imgUrl);
			
		}
	    public static final Parcelable.Creator<FilmInfo> CREATOR = new Creator<FilmInfo>() {

	        @SuppressWarnings("unchecked")
	        public FilmInfo createFromParcel(Parcel source) {
	            FilmInfo filmInfo = new FilmInfo();
	            filmInfo.filmName = source.readString();
	            filmInfo.director = source.readString();
	            filmInfo.starring = source.readString();
	            filmInfo.produce = source.readString();
	            filmInfo.summary = source.readString();
	            filmInfo.actionTime = source.readString();
	            filmInfo.imgUrl = source.readString();
	            return filmInfo;
	        }

	        public FilmInfo[] newArray(int size) {
	            return new FilmInfo[size];
	        }

	    };
}
