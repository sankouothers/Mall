package com.wang.extmall.RestController;


import com.wang.extmall.command.IndentCommand;
import com.wang.extmall.model.Indent;
import com.wang.extmall.service.IndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ozintel06 on 2016/11/30.
 */
@RestController
public class RestIndentController {

  @Autowired
  private IndentService indentService;


  @RequestMapping(value = "/indent",method = RequestMethod.POST)
  public ResponseEntity createIndent(IndentCommand indentCommand) {

    Indent indent = indentCommand.toAddress();
    indentService.save(indent);

    return new ResponseEntity(HttpStatus.OK);
  }


  @RequestMapping(value = "/indent/{id}",method = RequestMethod.GET)
  public ResponseEntity<IndentCommand> IndentInfo(@PathVariable("id") long id) {

    Indent indent = indentService.findOne(id);

    IndentCommand indentCommand = new IndentCommand();

    indentCommand.toIndentInfo(indent);

    return new ResponseEntity<IndentCommand>(indentCommand,HttpStatus.OK);
  }
}
