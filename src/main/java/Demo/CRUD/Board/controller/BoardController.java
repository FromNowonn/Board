package Demo.CRUD.Board.controller;

import Demo.CRUD.Board.dto.PageRequestDto;
import Demo.CRUD.Board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("UserBoard")
@RequiredArgsConstructor
@Log4j2

public class BoardController {
    private final BoardService service;
    @GetMapping("/")
    public String index(){

        return "redirect:UserBoard/list";
    }
    @GetMapping("list")
    public void list(PageRequestDto pageRequestDto, Model model){
        log.info("list============"+pageRequestDto);
        model.addAttribute("result",service.getList(pageRequestDto));
    }

}
