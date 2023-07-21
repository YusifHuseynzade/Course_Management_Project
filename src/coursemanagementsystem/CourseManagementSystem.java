package coursemanagementsystem;

import bean.Config;
import util.MenuUtil;


public class CourseManagementSystem {
    public static void main(String[] args) {
            Config.initialize();
            MenuUtil.showMenu();
        }
    }
