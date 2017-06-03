package cn.edu.sdut.controller;

import cn.edu.sdut.model.Button;
import cn.edu.sdut.model.ClickButton;
import cn.edu.sdut.model.ViewButton;

public class Menu {
	private Button[] button;

	public Button[] getButton() {
		return button;
	}

	public void setButton(Button[] button) {
		this.button = button;
	}
	
	public static Menu initMenu() {
		Menu menu = new Menu();
		//主菜单1:click menu
		ClickButton button11 = new ClickButton();
		button11.setName("click菜单");
		button11.setType("click");
		//主菜单2:clickMenu的id key
		button11.setKey("11");
		
		ViewButton button21 = new ViewButton();
		button21.setName("view菜单");
		button21.setType("view");
		button21.setUrl("http://wwww.baidu.com");
		
		ClickButton button31 = new ClickButton();
		button31.setName("扫码事件");
		button31.setType("scancode_push");
		button31.setKey("31");
		
		ClickButton button32 = new ClickButton();
		button32.setName("地理位置");
	    button32.setType("location_select");
	    button32.setKey("32");
	    //主菜单3:二级菜单
	    Button button = new Button();
	    button.setName("菜单");
	    button.setSub_button(new Button[] {button31,button32});
	    
	    menu.setButton(new Button[] {button11,button21,button});
		return menu;
	}
}