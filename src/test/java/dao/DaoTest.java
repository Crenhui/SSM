package dao;


import com.duyi.onlinevideo.dao.*;
import com.duyi.onlinevideo.entity.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml", "classpath:spring/spring-web.xml"})
public class DaoTest {

    @Autowired
    CourseTypeDao courseTypeDao;

    @Autowired
    BannerDao bannerDao;

    @Autowired
    CourseTopicDao courseTopicDao;

    @Autowired
    CourseVideoDao courseVideoDao;

    @Autowired
    ToolsItemDao toolsItemDao;

    @Autowired
    ToolsTypeDao toolsTypeDao;

    @Autowired
    UserDao userDao;

    @Test
    public void t1() {

        CourseType courseType = new CourseType();
        courseType.setFlag(1);
        courseType.setName("数据库优化");

        int code = courseTypeDao.insertCourseType(courseType);
        System.out.println(code);
    }

    @Test
    public void t2() {

        Banner banner = new Banner();
        banner.setCreateTime(new Date());
        banner.setFlag(1);
        banner.setImgUrl("url");
        banner.setTargetUrl("target");
        banner.setType(1);

        int code = bannerDao.insertBanner(banner);
        System.out.println(code);
    }

    @Test
    public void t3() {

        CourseTopic courseTopic = new CourseTopic();
        courseTopic.setCoursewareUrl("1");
        courseTopic.setCreateTime(new Date());
        courseTopic.setTitle("title");

        int code = courseTopicDao.insertCourseTopic(courseTopic);
        System.out.println(code);
    }

    @Test
    public void t4() {

        CourseVideo courseVideo = new CourseVideo();
        courseVideo.setName("video");

        int code = courseVideoDao.insertCourseVideo(courseVideo);
        System.out.println(code);
    }

    @Test
    public void t5() {

        ToolsItem toolsItem = new ToolsItem();
        toolsItem.setName("toolsitem");

        int code = toolsItemDao.insertToolsItem(toolsItem);
        System.out.println(code);
    }

    @Test
    public void t6() {

        ToolsType toolsType = new ToolsType();
        toolsType.setName("toolstype");

        int code = toolsTypeDao.insertToolsType(toolsType);
        System.out.println(code);
    }


    @Test
    public void t7() {

        User user = new User();
        user.setUsername("username");

        int code = userDao.insertUser(user);
        System.out.println(code);
    }
}
