package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;
	
	public static void browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
		
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	public static String gettingTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String gettingCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String gettingText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String gettingAttribute(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
	public static void thread(int num) throws InterruptedException {
		Thread.sleep(num);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void selectByValue(WebElement element, String value) {

		Select s1 = new Select(element);
		s1.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String value) {
		Select s2 = new Select(element);
		s2.selectByVisibleText(value);
	}

	public static void deselectByIndex(WebElement element, int num) {
		Select s3 = new Select(element);
		s3.deselectByIndex(num);
	}

	public static void deselectByValue(WebElement element, String value) {
		Select s4 = new Select(element);
		s4.deselectByValue(value);
	}

	public static void deselectByvisibleText(WebElement element, String value) {
		Select s5 = new Select(element);
		s5.deselectByVisibleText(value);
	}

	public static void deselectAll(WebElement element) {
		Select d = new Select(element);
		d.deselectAll();
	}
	public static List<WebElement> gettingObject(WebElement element) {
		Select w = new Select(element);
		List<WebElement> options = w.getOptions();
		return options;
	}

	public static boolean multipleSelect(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public static String excelRead(String path, String sheetName, int index, int cellindex) throws IOException {

		File f = new File(path);
		FileInputStream fs = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fs);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(index);
		Cell cell = row.getCell(cellindex);
		int cellType = cell.getCellType();
		if (cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			String format = s.format(dateCellValue);
			return format;
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			// to convert long into string
			String l1 = String.valueOf(l);
			return l1;

		}
	}

	public static void excelWrite(String path, String sheetName, int index, int cellValue, String value)
			throws IOException {

		File f = new File(path);
		FileOutputStream stream = new FileOutputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet(sheetName);
		Row createRow = createSheet.createRow(index);
		Cell createCell = createRow.createCell(cellValue);
		createCell.setCellValue(value);
		w.write(stream);

	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicityWait(int num) {

		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);

	}

	public static void takesScreenshot(String value) throws IOException {
		File f = new File(value);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, f);

	}

	public static void close() {
		driver.close();
	}

	public static String tagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	public static boolean display(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static void equals(WebElement element, String value) {

		element.equals(value);

	}

	public static int parseInt(String value) {
		int parseInt = Integer.parseInt(value);
		return parseInt;
	}

	public static String valueOf(int num) {
		String valueOf = String.valueOf(num);
		return valueOf;
	}

	public static boolean isEnable(WebElement element) {

		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static boolean isSelected(WebElement element) {

		boolean selected = element.isSelected();
		return selected;
	}
	public static void excelOverwrite(String path, String sheetName, int num, int num1, String value,String Value1) throws IOException {
		
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(num);
		Cell cell = row.getCell(num1);
		String stringCellValue = cell.getStringCellValue();
		boolean equals = stringCellValue.equals(value);
		if(!equals) {
			cell.setCellValue(Value1);
		}
		FileOutputStream fd = new FileOutputStream(f);
		w.write(fd);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
