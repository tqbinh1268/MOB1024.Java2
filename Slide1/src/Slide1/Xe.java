package Slide1;

public class Xe {
	private String hangXe;
	private int namSanXuat; //CONGAN congAn coNgan
	
	public Xe() {}
	
	public Xe(String hangXe, int namSanXuat) {
		this.hangXe = hangXe;
		this.namSanXuat = namSanXuat;
	}

	public String getHangXe() {
		return this.hangXe;
	}
	
	public void setHangXe(String hangXe) {
		this.hangXe = hangXe;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	@Override
	public String toString() {
		return "Xe mới [hangXe=" + hangXe + ", namSanXuat=" + namSanXuat + "]";
	}

	
	
	
}
