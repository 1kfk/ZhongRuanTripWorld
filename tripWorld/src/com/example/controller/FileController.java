package com.example.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.example.dao.PlaceDao;
import com.example.model.Place;

@Controller
public class FileController {
	@Autowired
	PlaceDao placedao;
    @RequestMapping(value = "/fileupdate/{idd}",method=RequestMethod.POST)
    public String commUploadA(HttpServletRequest request,@PathVariable("idd") String idd) throws JSONException {
        try {
            //ֱ��newһ��CommonsMultipartResolver
            CommonsMultipartResolver cmr = new CommonsMultipartResolver(request.getServletContext());
            cmr.setDefaultEncoding("utf-8");
            cmr.setMaxInMemorySize(40960);
            cmr.setMaxUploadSize(10485760000L);
            if (cmr.isMultipart(request)) {
                MultipartHttpServletRequest multipartRequest = cmr.resolveMultipart(request);
                MultipartFile file = multipartRequest.getFile("filedata");// ��ҳ��input��name��ͬ
                File imageFile = new File(request.getSession().getServletContext().getRealPath("/") + "scene/"  
                        + file.getOriginalFilename());// �ϴ�����ļ�����Ŀ¼������
                System.out.println(imageFile.getAbsolutePath());
                file.transferTo(imageFile);// ���ϴ��ļ����浽��Ӧλ��
//                String id = request.getParameter("id");
                int pid = Integer.parseInt(idd);
                String filename=file.getOriginalFilename();
                Place p = new Place();
                p.setId(pid);
                p.setScene(filename);
                placedao.insertpic(p);
                return "redirect:/allusermation"; 
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("=-=");
        }
        return "redirect:/allusermation"; 
    }

}
