package Demo.CRUD.Board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class BoardDto {
    private Long boardId;
    private String boardTitle;
    private String boardContents;
    private String boardWriter;
    private LocalDateTime regDate, modDate;
}
