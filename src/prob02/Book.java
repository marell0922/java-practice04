package prob02;

/*
 * 
 *
Book클래스
Book
int bookNo
String title
String author
int stateCode
Book(int bookNo,String title,String author)
rent() : void
print() : void

1.	멤버변수는 다음과 같으며 모든 멤버 변수는 초기값을 지정하지 않습니다.
int bookNo: 번호
String title: 제목
String author: 작가
int stateCode: 상태코드(대여유무를 나타내는 상태코드)
2.	생성자는 BookShop의 main메소드를 참고하여 각 멤버변수를 초기화할 수 있도록 작업합니다. 단, stateCode는 생성자 호출 시에 1로 세팅 되도록 설정합니다.
3.	각각의 메소드는 아래의 기능을 구현하도록 작성합니다.
-	모든 메소드는 public으로 작성합니다.
-	bookNum, title, genre에 대해서는 모든 setter/getter메소드를 추가하세요.
-	rent() : 대여기능을 수행하는 메소드로 
Book클래스의 stateCode를 0으로 변경하며  “_______이(가) 대여 됐습니다.”메시지가 출력되도록 작성합니다.이때 ______는 책제목이 출력되도록 작성합니다.
-	print(): 책의 정보가 출력형태와 같이 출력될 수 있도록 작성합니다. 이때 대여 유무는 Book클래스의 stateCode가 1이면 “재고있음”으로 0이면 “대여중”으로 출력되도록 설정합니다.

 * */
public class Book {
	
	//field
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	//constructor
	public Book(int bookNo, String title, String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		this.stateCode=1;
	}
	
	//method
	public void setBookNo(int bookNo) {
		this.bookNo=bookNo;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void print() {
		System.out.print("책 제목 : "+title+", 작가 : "+author+", 대여 유무 : ");
		
		if(stateCode==1) {
			System.out.println("재고 있음");
		}else if(stateCode==0) {
			System.out.println("대여 중");
		}
		
	}
	
	public void rent() {
		
		if(stateCode==1) {
			stateCode=0;
			System.out.println(title+"이(가) 대여 됐습니다.");
		}
	}
}