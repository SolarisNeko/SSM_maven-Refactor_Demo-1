/*
package com.kusonl.controller;

import com.shop.domain.Product;
import com.shop.myException.MyException;
import com.shop.service.ProductService;
import com.shop.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Controller
public class ProductController_Final {

    //注入Service层
    @Autowired
    private ProductService productService;

    // 2级访问路径
    @RequestMapping(value = "/product")
    public ModelAndView getProductList() {

        ModelAndView modelAndView = new ModelAndView();

        List<Product> products = this.productService.getProductList();

        //往model域中,存数据
        modelAndView.addObject("productList", products);
            //和 productList.jsp中的 ${productList} 对应
            //相当于Servlet的request.setAttribute("..", ...);

        modelAndView.setViewName("productList");

        return modelAndView;
    }

    //根据id去查徐
//    @RequestMapping(value = "/itemEdit.action")
//    public ModelAndView getProductById(HttpServletRequest request) { // Java EE 6
//
//        ModelAndView modelAndView = new ModelAndView();
//
//        String id = request.getParameter("id");
//        Product product = this.productService.getProductById(id);
//
//        modelAndView.addObject("item", product);
//
//        modelAndView.setViewName("productItem");
//
//        return modelAndView;
//    }

    @RequestMapping(value = "updateitem.action")
    public ModelAndView updateitem(Product product) {

        ModelAndView modelAndView = new ModelAndView();

        product.setCreatetime(new Date());
        this.productService.updateitem(product);

        modelAndView.setViewName("success");
        return modelAndView;
    }

*/
/*    //1. 后台接收参数的时候, 【参数名】必须和【表单】中的name属性一致
    //2. 参数类型, 可以用表单中String form_elem_name
    @RequestMapping(value = "updateitem.action")
    public ModelAndView updateitem(String id, String name, String price, String detail) {

        ModelAndView modelAndView = new ModelAndView();
        Product product = new Product();

        product.setId(Integer.parseInt(id));
        product.setName(name);
        product.setPrice(Float.parseFloat(price));
        product.setDetail(detail);
        product.setCreatetime(new Date()); // 要看数据库有哪些column, 不能为null

        this.productService.updateitem(product);

        modelAndView.setViewName("success");
        return modelAndView;
    }*//*


    @RequestMapping(value = "/querySearchItem.action")
    public ModelAndView querySearchItem(CustomerVo customerVo) {
        System.out.println("customerVo ----------- " + customerVo);

        return null;
    }

    //批量删除
    @RequestMapping(value = "/deleteAllItem.action", method = {RequestMethod.POST, RequestMethod.GET} )
    public ModelAndView deleteAllItem(String[] ids) {

        ModelAndView modelAndView = new ModelAndView();

        this.productService.deleteAllItem(ids);

        List<Product> productList = this.productService.getProductList();
        modelAndView.addObject("productList", productList);

        modelAndView.setViewName("productList");
        return modelAndView;
    }


    @RequestMapping("updateItem.action")
    public ModelAndView updateitem2(Product product, MultipartFile pictureFile) throws IOException {

        // 实现上传逻辑

        //1.获取原始的文件名称 --
        String originalFilename = pictureFile.getOriginalFilename();

        //2.将 原始文件名称 处理
        String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));

//        File file = new File("...");
//        if (!file.exists()) {
//            file.mkdirs();
//        }

        //3.上传实现
        pictureFile.transferTo(new File("H:\\教学资料\\File_Output\\" + fileName));

        //4.将【图片】封装到【数据库】中 = sql存【图片名】,以后根据【图片名】new File获取
        product.setPic(fileName);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/")
    public ModelAndView testAjax() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("test");

        return modelAndView;
    }

    @RequestMapping(value = "/itemEdit/{id}")
    public ModelAndView getProductById(HttpServletRequest request, @PathVariable(value="id") String id) { // Java EE 6

        ModelAndView modelAndView = new ModelAndView();

        Product product = this.productService.getProductById(id);

        modelAndView.addObject("item", product);
        modelAndView.setViewName("productItem");
        return modelAndView;
    }


    @RequestMapping("/productException")
    public ModelAndView exceptionList() throws MyException {

        ModelAndView modelAndView = new ModelAndView();
        // 会去查寻【数据库】,

        if (true) {
            throw new MyException("没有找到测试类, 触发MyException...");
        }

        List<Product> list = this.productService.getProductList();
        modelAndView.addObject("products", list);
        return modelAndView;
    }
}
*/
