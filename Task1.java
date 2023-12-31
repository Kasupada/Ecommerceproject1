package com.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.asserts.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Task1 {
	WebDriver driver=new ChromeDriver();
    @BeforeTest
    public void initializer() {
    	
    WebDriverManager.chromedriver().setup();
    System.out.println("Start of Execution");
    driver.get("https://automationexercise.com/");
   
    }
    @Test
    public void signUp1() {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    	   String excelFilePath = "path/to/your/excel/file.xlsx";
    }
    public void signup11() {
    	  try {
              // Load the Excel file
              FileInputStream fileInputStream = new FileInputStream(new File(excelFilePath));
              Workbook workbook = new XSSFWorkbook(fileInputStream);
              Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

              // Get data from Excel and perform actions
              String name = sheet.getRow(1).getCell(0).getStringCellValue();
              String email = sheet.getRow(1).getCell(1).getStringCellValue();
              // Continue retrieving data for other fields

              // Perform actions using Selenium WebDriver
              driver.findElement(By.name("name")).sendKeys(name);
              driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys(email);
              // Continue performing actions for other fields

        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("password")).sendKeys("saha2825");
        driver.findElement(By.id("days")).click();
        driver.findElement(By.xpath("//*[@id=\"days\"]/option[26]")).click();
        driver.findElement(By.id("months")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[2]")).click();
        driver.findElement(By.id("years")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[20]")).click();
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys("sai");
        driver.findElement(By.id("last_name")).sendKeys("varsha");
        driver.findElement(By.id("company")).sendKeys("deloitte");
        driver.findElement(By.id("address1")).sendKeys("12345566");
        driver.findElement(By.id("address2")).sendKeys("12345566");
        driver.findElement(By.id("country")).click();
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[1]")).click();
        driver.findElement(By.id("state")).sendKeys("telangana");
        driver.findElement(By.id("city")).sendKeys("warangal");
        driver.findElement(By.id("zipcode")).sendKeys("123456");
        driver.findElement(By.id("mobile_number")).sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
    	  } catch (IOException e) {
              e.printStackTrace();
          }
    }
    @Test
    public void loginInWithCorrectInput2() {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Amrutha28@gmail.com");
    	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha2825");
    	  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
   System.out.println("login with correct input ");
   
    }
   @Test
    public void loginInWithInCorrectMail3() {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Akhila28@gmail.com");
    	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha2825");
    	  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
    	  System.out.print("login with incorrect mail ");
    	  loginInWithInCorrectPassword() ;
    	  loginInWithInCorrectInput();
    }
   
    public void loginInWithInCorrectPassword() {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Amrutha28@gmail.com");
    	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha28");
    	  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
    	  System.out.println("login with incorrect password ");
    }
    public void loginInWithInCorrectInput() {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Akhila28@gmail.com");
    	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha28");
    	  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
    	  System.out.println("login with incorrect input ");
    }
    @Test
    public void logOutUser4() {
    	//signup/login
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    	//login mail
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Amrutha28@gmail.com");
    	//login password
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha2825");
    	//login button  
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
    	//logout button
    	  driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a/i")).click();
    }
    @Test
    public void RegisterUserwithexistingemail5() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    	//register name
    	driver.findElement(By.name("name")).sendKeys("Amrutha");
    	//register mail
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("Amrutha@gmail.com");
    	//register button
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
        // Locate the element that contains the error message
        WebElement errorMessageElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p"));

        // Check if the error message is displayed
        if (errorMessageElement.isDisplayed()) {
            // If displayed, print the error message
            System.out.println("Error message is displayed: " + errorMessageElement.getText());
        } else {
            // If not displayed, print a message indicating it's not displayed
            System.out.println("succesfully Registered");
        }
    	
    }
    @Test
    public void ContactUsForm6() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")).click();	
    	 // Fill in the form fields
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input"))
                .sendKeys("Amrutha");
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input"))
                .sendKeys("Amrutha28@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input"))
                .sendKeys("what is this?");
        driver.findElement(By.id("message")).sendKeys("concentrate on goal");

        // Locate the file input field using its HTML attribute (e.g., id, name, etc.)
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input"));

        // Specify the path to the file you want to upload
        String filePath = "C:\\Users\\Sangeetha Daram\\OneDrive\\Desktop\\varshu\\Random.txt";

        // Use sendKeys to input the file path into the file input field
        fileInput.sendKeys(filePath);
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input")).click();	
        driver.switchTo().alert().accept();
        WebElement successMessageElement = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]"));

        // Check if the error message is displayed
        if (successMessageElement.isDisplayed()) {
            // If displayed, print the error message
            System.out.println(" success message is displayed  with complete info" );
        } else {
            // If not displayed, print a message indicating it's not displayed
            System.out.println("no success message is displayed  with missing field");
        }
    	
        System.out.println("successfully detailes sent for contact us form with incorrect input");
        
    
      
  	
      
        ContactUsFormMissingOneField6();
      
        
    }
    
    public void ContactUsFormMissingOneField6 () 
    {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")).click();	
    	 // Fill in the form fields
    	//name
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input"))
                .sendKeys("Amrutha12");
        //mail input 
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input"))
                .sendKeys("Amrutha28@gmail.com");
        //subject input field
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input"))
                .sendKeys("what is this?");
        //message input field
        driver.findElement(By.id("message")).sendKeys("concentrate on goal");
        //submit button
        driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input")).click();
        try {
            // Check if an alert is present
            Alert alert = driver.switchTo().alert();
            // If an alert is present, print a message
            System.out.println("Alert is displayed: " + alert.getText()+"in ContactUsFormMissingOneField6" );
            // Handle the alert as needed (e.g., accept, dismiss, etc.)
            alert.accept();
        } catch (NoAlertPresentException e) {
            // If no alert is present, proceed with checking the success message
        	 System.out.println("Alert is notdisplayed: " );
        }
            WebElement successMessageinmissingonefieldElement = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]"));
          

       // Check if the error message is displayed
       if (successMessageinmissingonefieldElement.isDisplayed()) {
            // If displayed, print the error message
            System.out.println(" success message is displayed even with missing field " );
        } else {
            // If not displayed, print a message indicating it's not displayed
        	
            System.out.println("no success message is displayed  with missing field");
        }
    	
        
       
    }
    @Test
    public void VerifyTestCasesPage7 ()
    {
    	 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();	
    	    // Identify elements representing the test cases in the list
         java.util.List<WebElement> testCaseElements = driver.findElements(By.cssSelector("#form > div > div:nth-child(2) > div > div.panel-heading > h4 > a > u")); // replace with the appropriate selector

         // Verify the presence of specific test cases or elements within the list
         if (testCaseElements.size() > 0) {
             System.out.println("Test Cases are present:");

             // Print the names of the test cases
             for (WebElement testCaseElement : testCaseElements) {
                 System.out.println(testCaseElement.getText());
             }
         } else {
             System.out.println("No Test Cases found.");
         }
    } 
    @Test
    public void VerifyAllProductsandproductdetailpage8 ()
    {
    	 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a/i")).click();	
    	  // Identify elements representing products on the main page
        java.util.List<WebElement> productElements = driver.findElements(By.cssSelector("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.single-products > div.productinfo.text-center > img")); // Update with your actual selector

        // Iterate through each product element
        for (WebElement productElement : productElements) {
            // Extract relevant information about the product (e.g., name, price, etc.)
            String productName = productElement.findElement(By.cssSelector("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.single-products > div.productinfo.text-center > p")).getText();
            String productPrice = productElement.findElement(By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.single-products > div.product-overlay > div > h2")).getText();

            // Store the information or perform verification as needed

           
            // Click on the product to navigate to the product detail page
            WebElement viewProductButton = productElement.findElement(By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.choose > ul > li > a > i"));
            viewProductButton.click();

            // Verify the information on the product detail page
            WebElement detailPageProductName = driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > h2"));
            WebElement detailPageProductPrice = driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > span > span"));

            // Perform verifications, for example:
            if (detailPageProductName.getText().equals(productName) && detailPageProductPrice.getText().equals(productPrice)) {
                System.out.println("Verification Passed for " + productName);
            } else {
                System.out.println("Verification Failed for " + productName);
            }

            // Navigate back to the main page to check the next product
            driver.navigate().back();
        }

    } 
    @Test	
    public void SearchProduct9(){
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a/i")).click();	
    	  // Find the search input field by ID (replace "search" with the actual ID or other locator)
        WebElement searchField = driver.findElement(By.id("search_product"));

        // Enter the product name into the search field
        searchField.sendKeys("Blue Top");

        // Press the Enter key to perform the search
       driver.findElement(By.id("submit_search"));

        // Wait for the search results page to load (you might need to adjust the time based on your application)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test	
    public void VerifySubscriptioninhomepage10(){
    	

   	 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")).click();
   	WebElement search= driver.findElement(By.id("susbscribe_email"));
   	search.sendKeys("Amrutha28@gmail.com");
   	search.sendKeys(Keys.ENTER);
    }
    @Test	
    public void VerifySubscriptioninCartpage11(){
    	
    	 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
    		WebElement search= driver.findElement(By.id("susbscribe_email"));
    		search.sendKeys("Amrutha28@gmail.com");
    		search.sendKeys(Keys.ENTER);
    }
    @Test	
    public void AddProductsinCart12() throws InterruptedException{
   	 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
   	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
   	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
    Thread.sleep(5000);
   	driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
    driver.navigate().back();
    }
    @Test	
    public void VerifyProductquantityinCart13() throws InterruptedException{
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
      	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
      	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
       Thread.sleep(5000);
      	driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
       driver.navigate().back();
    	 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
    	String noofpro= driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[4]/button")).getText();
    	System.out.println(noofpro);
    }
    @Test	
    public void PlaceOrderAndRegisterwhileCheckout14() throws InterruptedException{
    	//add to cart
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
      	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
      	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
       Thread.sleep(5000);
      	driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
       driver.navigate().back();
       //cart button
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a/i")).click();
    	//proceed to check out button
    	driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
    	//register/login button
    	driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")).click();
    	
    	//register along with name and mail with resister button before giving complete detailes
    	
    	signup11();
        
    	//continue button
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    	
    }
    @Test	
    public void PlaceOrderRegisterbeforeCheckout15() throws InterruptedException{
    	//add to cart
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
      	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
      	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
       Thread.sleep(5000);
      	driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
       driver.navigate().back();
       //register/login button
       driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Amrutha28@gmail.com");
   	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha2825");
   	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
       //cart button
      	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a/i")).click();
    	//proceed to check out button
       	driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
       	//comment field
       	driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("wsdxecftvghbjn");
       	//place order button
    	driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
       	
    }
    @Test	
    public void PlaceOrderLoginbeforeCheckout16() throws InterruptedException{
    	//add to cart
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
      	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
      	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
       Thread.sleep(5000);
      	driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
       driver.navigate().back();
     //cart button
   	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a/i")).click();
   	//proceed to check out button
   	driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
 
   	//register/login button
    driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")).click();
    //login
    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Amrutha28@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha2825");
	//login button
	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	//cart button
	   	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a/i")).click();
	   	//proceed to check out button
	   	driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
	//comment field
   	driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("wsdxecftvghbjn");
   	//place order button
	driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
    }
    @Test	
    public void RemoveProductsFromCart17() throws InterruptedException{
    	//add to cart
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
    	//add to cart button (first)
      	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
      	//add to cart button (second)
      	 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
       Thread.sleep(5000);
      	driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
       driver.navigate().back();
    	//cart button
       	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a/i")).click();
       	//cancel button in the cart
    	driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[6]/a/i")).click();
    	
    }
    
    @Test
    public void viewCategoryProducts18() {
    	// product 
    	
        navigateToCategory("Women", "Dress");
        navigateToCategory("Women", "Tops");
        navigateToCategory("Women", "Saree");
        navigateToCategory("Men", "Tshirts");
        navigateToCategory("Men", "Jeans");
        navigateToCategory("Kids", "Dress");
        navigateToCategory("Kids", "Tops and Shirts");
    }

    private void navigateToCategory(String parentCategory, String subCategory) {
    	// Click on the product link
        driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a")).click();
        // Click on the parent category
        String parentCategoryXpath = String.format("//*[@id='accordian']/div[contains(@class,'%s')]/div[1]/h4/a", parentCategory);
        parentCategoryXpath.click();

        // Click on the sub-category
        String subCategoryXpath = String.format("//*[@id='%s']/div/ul/li/a", subCategory);
       

        
    }

    


    @Test	
    public void SearchProductsandVerifyCartAfterLogin20() throws InterruptedException{
    	// product 
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
    
    	//search input field
    	driver.findElement(By.id("search_product")).sendKeys("Blue Top");
    	//click search button
    	driver.findElement(By.id("submit_search")).click();
    	//add to cart button (first)
     	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
     	//add to cart button (second)
     	 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
      Thread.sleep(5000);
     	driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
      driver.navigate().back();
      //signup/login
      driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    //login
      driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Amrutha28@gmail.com");
  	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha2825");
  //login button
  	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
      //cart
      driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
      
   
    	
    }
    @Test	
    public void Addreviewonproduct21(){
    	// product 
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
    
    	//search input field
    	driver.findElement(By.id("search_product")).sendKeys("Blue Top");
    	//click search button
    	driver.findElement(By.id("submit_search")).click();
    	//add to cart button (first)
    	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
    	//name adding
    	 driver.findElement(By.id("name")).sendKeys("Amrutha28@gmail.com");
    	 //email adding
    	 driver.findElement(By.id("email")).sendKeys("Amrutha28@gmail.com");
    	 //adding review on product
     	driver.findElement(By.id("review")).sendKeys("Blue Top");
     	//submit button
    	driver.findElement(By.id("button-review")).click();
    	 WebElement submissionsuccessfullmsg = driver.findElement(By.xpath("//*[@id=\"review-section\"]/div/div/span"));
         

         // Check if the error message is displayed
         if (submissionsuccessfullmsg.isDisplayed()) {
              // If displayed, print the error message
              System.out.println(" success message is displayed after adding review " );
          } else {
              // If not displayed, print a message indicating it's not displayed
          	
              System.out.println("no success message is displayed after adding review ");
          }
    }

    @Test	
    public void Verifyaddressdetailsincheckoutpage23(){
    	
    	//signup/login
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        //login
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Amrutha28@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha2825");
    //login button
    	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
    	//cart
         driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
         //checkout button
         driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
         // Get the text of the address element
         
         String actualAddress = "warangal telangana 123456";
         
         String expectedAddress1 = driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[6]")).getText();
         // Specify the expected address
        
         
         if (actualAddress.equals(expectedAddress1)) {
             System.out.println("Address verification passed!");
         } else {
             System.out.println("Address verification failed!");
             System.out.println("Actual address: " + actualAddress);
             System.out.println("Expected address: " + expectedAddress1);
         }
           
         
    }
    @Test	
    public void DownloadInvoiceafterpurchaseorder24() throws InterruptedException{
    	//signup/login
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        //login
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("Amrutha28@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("saha2825");
    //login button
    	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
    	// product 
     	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
     	//search input field
    	driver.findElement(By.id("search_product")).sendKeys("Blue Top");
    	//click search button
    	driver.findElement(By.id("submit_search")).click();
    	//add to cart button (first)
     	 driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
     	//add to cart button (second)
     	 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
      Thread.sleep(5000);
     	driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
      driver.navigate().back();
    //cart
      driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
      //checkout button
      driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
      //place order button 
      driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
      //payment method
      //name
      driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input")).sendKeys("varsha");
      //card no
      driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input")).sendKeys("1234567");
      //cvc
      driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input")).sendKeys("234");
      //exp
      driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input")).sendKeys("12");
      //year
      driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input")).sendKeys("345");
      //pay ad conform order
      driver.findElement(By.id("submit")).click();
      //download invoice button
      driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/a")).click();
      //continue
      driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
  
    }
    @Test
    public void testScrollUpAndDown25() throws InterruptedException {
    	// product 
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();

        // Simulate scrolling down
        scrollDown();
        Thread.sleep(4000);
        // Simulate scrolling up
        scrollUp();

    }

    private void scrollUp() {
        // Use JavaScript to scroll up
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, -500)");

        // Alternatively, you can use Actions class with Keys.ARROW_UP
        // Actions actions = new Actions(driver);
        // actions.sendKeys(Keys.ARROW_UP).perform();
    }

    private void scrollDown() {
        // Use JavaScript to scroll down
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, 500)");

        // Alternatively, you can use Actions class with Keys.ARROW_DOWN
        // Actions actions = new Actions(driver);
        // actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

  
    @Test	
    public void VerifyScrollUpwithoutArrowbuttonandScrollDownfunctionality26() throws InterruptedException{

    	        // Scroll down
    	        scrollByPixels(500);
Thread.sleep(4000);
    	        // Scroll up
    	        scrollByPixels(-500);
    	    }

    	    private void scrollByPixels(int pixels) {
    	        // Use JavaScript to scroll by a specified number of pixels
    	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    	        jsExecutor.executeScript("window.scrollBy(0, arguments[0])", pixels);
    	    }
    
    @AfterTest
    public void endUp() throws InterruptedException {
   	 Thread.sleep(5000);
   	 driver.close();
   	 
   }
    
    
}
