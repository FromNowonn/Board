package Demo.CRUD.Board.service;

import Demo.CRUD.Board.dto.BoardDto;
import Demo.CRUD.Board.dto.PageRequestDto;
import Demo.CRUD.Board.dto.PageResultDto;
import Demo.CRUD.Board.entity.Board;
import Demo.CRUD.Board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.Target;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@Log4j2
@RequiredArgsConstructor

public class BoardServiceImpl implements BoardService{
    private final BoardRepository repository;
    @Override
    public Long register(BoardDto dto){
        log.info("DTO================");
        log.info(dto);

        Board entity = dtoToEntity(dto);
        log.info(entity);
        repository.save(entity);
        return entity.getBoardId();
    }
    @Override
    public PageResultDto<BoardDto, Board> getList(PageRequestDto pageRequestDto){
        Pageable pageable = pageRequestDto.getPageable(Sort.by("boardId").descending());
        Page<Board> result = repository.findAll(pageable);
        Function<Board, BoardDto> fn = (entity -> entityToDto(entity));
        return new PageResultDto<>(result,fn);
    }

}
