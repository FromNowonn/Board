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
    private Long board_id;

    @Column(length = 100, nullable = false)
    private String board_title;

    @Column(length = 30, nullable = false)
    private String board_writer;

    @Column(length = 1500, nullable = false)
    private String board_contents;


}
