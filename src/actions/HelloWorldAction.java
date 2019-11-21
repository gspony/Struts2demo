package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Classname HelloWorldAction
 * @Description TODO
 * @Author
 * @Version V1.0.0
 * @Date 2019/11/21 12:01
 */
public class HelloWorldAction extends ActionSupport {
    private String name;

    @Override
    public String execute() throws Exception {
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
