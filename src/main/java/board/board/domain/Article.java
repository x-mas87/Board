package board.board.domain;
//게시글
import java.time.LocalDateTime;

public class Article {
    private int id;//아이디
    private String title;//제목
    private String content;//내용
    private String hashtag;//해쉬태그
    private LocalDateTime createdAt;//생성일시
    private String createdBy;//생성자
    private LocalDateTime modifiedAt;//수정일시
    private String modifiedBy;//수정자
}
