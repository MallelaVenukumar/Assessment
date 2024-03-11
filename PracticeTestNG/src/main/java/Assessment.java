
public class Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		# Initialize Chrome WebDriver (you can choose any other browser)
		driver = webdriver.Chrome()

		# Open the Flipkart website
		driver.get("https://www.flipkart.com")

		# Verify that the homepage loads successfully
		assert "Flipkart" in driver.title, "Failed to load Flipkart homepage"

		# Search for a laptop
		search_box = driver.find_element(By.NAME, "q")
		search_box.send_keys("laptop" + Keys.RETURN)

		# Wait for search results to load and click on the first laptop
		WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.CSS_SELECTOR, "div._1AtVbE")))
		laptop_link = driver.find_element(By.CSS_SELECTOR, "div._1AtVbE a")
		laptop_link.click()

		# Add the laptop to the cart
		add_to_cart_button = driver.find_element(By.CSS_SELECTOR, "button._2KpZ6l")
		add_to_cart_button.click()

		# Wait for the cart to update and proceed to checkout
		WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.CSS_SELECTOR, "div.VGWI6T button")))
		proceed_to_checkout_button = driver.find_element(By.CSS_SELECTOR, "div.VGWI6T button")
		proceed_to_checkout_button.click()

		# Login with valid credentials
		username_input = driver.find_element(By.CSS_SELECTOR, "input._2IX_2-._2Yfy4g")
		password_input = driver.find_element(By.CSS_SELECTOR, "input[type='password']")
		username_input.send_keys("your_username")
		password_input.send_keys("your_password")
		driver.find_element(By.CSS_SELECTOR, "button._2KpZ6l").click()

		# Verify successful login
		WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.CSS_SELECTOR, "div._1KCOnI")))

		# Enter shipping information
		address_input = driver.find_element(By.NAME, "addressLine2")
		city_input = driver.find_element(By.NAME, "city")
		state_input = driver.find_element(By.NAME, "state")
		zip_code_input = driver.find_element(By.NAME, "pincode")
		address_input.send_keys("Your Address")
		city_input.send_keys("Your City")
		state_input.send_keys("Your State")
		zip_code_input.send_keys("Your ZIP Code")
		driver.find_element(By.CSS_SELECTOR, "button._2KpZ6l").click()

		# Choose a payment method (not actually processing the payment)
		WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.CSS_SELECTOR, "div._1zC-2l")))
		driver.find_element(By.CSS_SELECTOR, "div._1zC-2l").click()

		# Verify the order summary (you can add more assertions here if needed)
		WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.CSS_SELECTOR, "div._16lebW")))
		order_summary = driver.find_element(By.CSS_SELECTOR, "div._16lebW")
		assert "Order Summary" in order_summary.text, "Order summary not found"

		# Close the browser
		driver.quit()

	}

}
