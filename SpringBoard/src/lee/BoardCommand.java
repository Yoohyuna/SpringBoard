package lee;

//���������� ����ڷκ��� �Է¹޴°��� ó�����ִ� Ŭ����
public class BoardCommand {

	String author,title,content;//num,date,readcnt=>�Է�X(����Ʈó��)
    //������->�Է¹޴� ������ �������=>�ڵ����� Setter Method ȣ��
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
		System.out.println("setAuthor() ȣ���!");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		System.out.println("setTitle() ȣ���!");
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		System.out.println("setContent() ȣ���!");
	}
}



