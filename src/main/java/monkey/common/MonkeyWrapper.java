package monkey.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MonkeyWrapper {
		
	public String monkeyClick(WebDriver driver,int time) {
	String status="Passed";
		try {
			
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		String script=" javascript: (function() {\r\n"
				+ "    function callback() {\r\n"
				+ "        gremlins.createHorde({\r\n"
				+ "            species: [gremlins.species.clicker()],\r\n"
				+ "            mogwais: [],\r\n"
				+ "            strategies: [gremlins.strategies.bySpecies()]\r\n"
				+ "        }).unleash();\r\n"
				+ "    }\r\n"
				+ "    var s = document.createElement(\"script\");\r\n"
				+ "    s.src = \"https://unpkg.com/gremlins.js\";\r\n"
				+ "    if (s.addEventListener) {\r\n"
				+ "        s.addEventListener(\"load\", callback, false);\r\n"
				+ "    } else if (s.readyState) {\r\n"
				+ "        s.onreadystatechange = callback;\r\n"
				+ "    }\r\n"
				+ "    document.body.appendChild(s);\r\n"
				+ "    })()";
		executor.executeScript(script);
		Thread.sleep(time*1000);
		driver.navigate().refresh();
		} catch (Exception e) {
			status="failed";
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public String monkeyToucher(WebDriver driver,int time) {
		String status="Passed";
			try {
				
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			String script="javascript: (function() {\r\n"
					+ "    function callback() {\r\n"
					+ "        gremlins.createHorde({\r\n"
					+ "            species: [gremlins.species.toucher()],\r\n"
					+ "            mogwais: [],\r\n"
					+ "            strategies: [gremlins.strategies.bySpecies()]\r\n"
					+ "        }).unleash();\r\n"
					+ "    }\r\n"
					+ "    var s = document.createElement(\"script\");\r\n"
					+ "    s.src = \"https://unpkg.com/gremlins.js\";\r\n"
					+ "    if (s.addEventListener) {\r\n"
					+ "        s.addEventListener(\"load\", callback, false);\r\n"
					+ "    } else if (s.readyState) {\r\n"
					+ "        s.onreadystatechange = callback;\r\n"
					+ "    }\r\n"
					+ "    document.body.appendChild(s);\r\n"
					+ "    })()";
			executor.executeScript(script);
			Thread.sleep(time*1000);
			driver.navigate().refresh();
			} catch (Exception e) {
				status="failed";
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		}


	public String monkeyEnterText(WebDriver driver,int time) {
		String status="Passed";
			try {
				
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			String script="javascript: (function() {\r\n"
					+ "    function callback() {\r\n"
					+ "        gremlins.createHorde({\r\n"
					+ "            species: [gremlins.species.formFiller()],\r\n"
					+ "            mogwais: [],\r\n"
					+ "            strategies: [gremlins.strategies.bySpecies()]\r\n"
					+ "        }).unleash();\r\n"
					+ "    }\r\n"
					+ "    var s = document.createElement(\"script\");\r\n"
					+ "    s.src = \"https://unpkg.com/gremlins.js\";\r\n"
					+ "    if (s.addEventListener) {\r\n"
					+ "        s.addEventListener(\"load\", callback, false);\r\n"
					+ "    } else if (s.readyState) {\r\n"
					+ "        s.onreadystatechange = callback;\r\n"
					+ "    }\r\n"
					+ "    document.body.appendChild(s);\r\n"
					+ "    })()";
			executor.executeScript(script);
			Thread.sleep(time*1000);
			driver.navigate().refresh();
			} catch (Exception e) {
				status="failed";
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		}

	public String monkeyScroller(WebDriver driver,int time) {
		String status="Passed";
			try {
				
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			String script="\r\n"
					+ "    javascript: (function() {\r\n"
					+ "    function callback() {\r\n"
					+ "        gremlins.createHorde({\r\n"
					+ "            species: [gremlins.species.scroller()],\r\n"
					+ "            mogwais: [],\r\n"
					+ "            strategies: [gremlins.strategies.bySpecies()]\r\n"
					+ "        }).unleash();\r\n"
					+ "    }\r\n"
					+ "    var s = document.createElement(\"script\");\r\n"
					+ "    s.src = \"https://unpkg.com/gremlins.js\";\r\n"
					+ "    if (s.addEventListener) {\r\n"
					+ "        s.addEventListener(\"load\", callback, false);\r\n"
					+ "    } else if (s.readyState) {\r\n"
					+ "        s.onreadystatechange = callback;\r\n"
					+ "    }\r\n"
					+ "    document.body.appendChild(s);\r\n"
					+ "    })()";
			executor.executeScript(script);
			Thread.sleep(time*1000);
			driver.navigate().refresh();
			} catch (Exception e) {
				status="failed";
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		}
	public String monkeyTyper(WebDriver driver,int time) {
		String status="Passed";
			try {
				
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			String script="javascript: (function() {\r\n"
					+ "    function callback() {\r\n"
					+ "        gremlins.createHorde({\r\n"
					+ "            species: [gremlins.species.typer()],\r\n"
					+ "            mogwais: [],\r\n"
					+ "            strategies: [gremlins.strategies.bySpecies()]\r\n"
					+ "        }).unleash();\r\n"
					+ "    }\r\n"
					+ "    var s = document.createElement(\"script\");\r\n"
					+ "    s.src = \"https://unpkg.com/gremlins.js\";\r\n"
					+ "    if (s.addEventListener) {\r\n"
					+ "        s.addEventListener(\"load\", callback, false);\r\n"
					+ "    } else if (s.readyState) {\r\n"
					+ "        s.onreadystatechange = callback;\r\n"
					+ "    }\r\n"
					+ "    document.body.appendChild(s);\r\n"
					+ "    })()";
			executor.executeScript(script);
			Thread.sleep(time*1000);
			driver.navigate().refresh();
			} catch (Exception e) {
				status="failed";
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		}
	public String monkeyAttack(WebDriver driver,int time) {
		String status="Passed";
			try {
				
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			String script=" javascript: (function() {\r\n"
					+ "    function callback() {\r\n"
					+ "        gremlins.createHorde({\r\n"
					+ "            species: [gremlins.species.clicker(),gremlins.species.toucher(),gremlins.species.formFiller(),gremlins.species.scroller(),gremlins.species.typer()],\r\n"
					+ "            mogwais: [],\r\n"
					+ "            strategies: [gremlins.strategies.allTogether()]\r\n"
					+ "        }).unleash();\r\n"
					+ "    }\r\n"
					+ "    var s = document.createElement(\"script\");\r\n"
					+ "    s.src = \"https://unpkg.com/gremlins.js\";\r\n"
					+ "    if (s.addEventListener) {\r\n"
					+ "        s.addEventListener(\"load\", callback, false);\r\n"
					+ "    } else if (s.readyState) {\r\n"
					+ "        s.onreadystatechange = callback;\r\n"
					+ "    }\r\n"
					+ "    document.body.appendChild(s);\r\n"
					+ "    })()";
			executor.executeScript(script);
			Thread.sleep(time*1000);
			driver.navigate().refresh();
			} catch (Exception e) {
				status="failed";
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		}

}
