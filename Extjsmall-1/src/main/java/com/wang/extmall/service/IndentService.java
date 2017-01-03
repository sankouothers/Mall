package com.wang.extmall.service;

import com.wang.extmall.model.Indent;
import com.wang.extmall.model.User;

import java.util.List;

/**
 * Created by ozintel06 on 2016/12/27.
 */
public interface IndentService {

  void save(Indent indent);

  Indent findOne(long id);

  List<Indent> findByConsumer(User consumer);
}
