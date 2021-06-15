package Demo.CRUD.Board.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Table(name = "board")
public class Board extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(length = 100, nullable = false)
    private String boardTitle;

    @Column(length = 30, nullable = false)
    private String boardWriter;

    @Column(length = 1500, nullable = false)
    private String boardContents;

    public void changeTitle(String boardTitle){
        this.boardTitle = boardTitle;
    }

    public void changeContent(String boardContents){
        this.boardContents = boardContents;
    }
}
