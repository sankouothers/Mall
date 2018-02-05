package com.wang.extmall.service.impl;

import com.wang.extmall.model.Indent;
import com.wang.extmall.model.User;
import com.wang.extmall.repository.IndentRepository;
import com.wang.extmall.service.IndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ozintel06 on 2016/12/27.
 */
@Service @Transactional public class IndentServiceImpl implements IndentService {

  @Autowired private IndentRepository indentRepository;


  @Override
  public void save(Indent indent) {
    indentRepository.save(indent);
  }

  @Override
  public Indent findOne(long id) {
    return indentRepository.findOne(id);
  }

  @Override
  public List<Indent> findByConsumer(User consumer) {
    return indentRepository.findByConsumer(consumer);
  }

  @Override
  public List<Indent> findByOrderByCreateDateDesc() {
    return indentRepository.findByOrderByCreateDateDesc();
  }
}
