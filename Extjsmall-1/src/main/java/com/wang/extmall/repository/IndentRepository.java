package com.wang.extmall.repository;

import java.util.List;
import com.wang.extmall.model.Indent;
import com.wang.extmall.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ozintel06 on 2016/12/27.
 */
public interface IndentRepository extends CrudRepository<Indent, Long> {

  List<Indent> findByConsumer(User consumer);
}
