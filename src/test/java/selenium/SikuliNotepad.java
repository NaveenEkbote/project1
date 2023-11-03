package selenium;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliNotepad {

	public static void main(String[] args) throws FindFailed {

			Screen s=new Screen();
			 s.click("notepad_icon.png");
			 s.find("notepad.png");
			 s.type("notepad.png","This is Nice Sikuli Tutorial!!!!");
	}

}
