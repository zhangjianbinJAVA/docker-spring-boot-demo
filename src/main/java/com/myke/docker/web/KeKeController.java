package com.myke.docker.web;

import com.myke.docker.domains.Visitor;
import com.myke.docker.repositories.VisitorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

/**
 * user: zhangjianbin <br/>
 * date: 2018/7/1 15:40
 */
@RestController
public class KeKeController {

    @Resource
    VisitorRepository visitorRepository;

    /**
     * 添加来访者记录
     *
     * @param request
     * @return
     */
    @RequestMapping("")
    public String index(HttpServletRequest request) {

        Visitor visitor = new Visitor();
        visitor.setId(UUID.randomUUID().toString());
        visitor.setIp(request.getRemoteAddr());
        visitor.setVisitDate(new Date());

        visitorRepository.save(visitor);

        Long count = visitorRepository.count();


        return String.format("你是来自%s的第%d位访问者。", request.getRemoteAddr(), count);
    }
}
