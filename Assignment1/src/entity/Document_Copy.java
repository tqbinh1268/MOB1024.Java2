package entity;

public class Document_Copy {
	private int id;
	private int document_id;
	private boolean status;
	
	public Document_Copy() {}

	public Document_Copy(int id, int document_id, boolean status) {
		super();
		this.id = id;
		this.document_id = document_id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDocument_id() {
		return document_id;
	}

	public void setDocument_id(int document_id) {
		this.document_id = document_id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Document_Copy [id=" + id + ", document_id=" + document_id + ", status=" + status + "]";
	}
	
}
