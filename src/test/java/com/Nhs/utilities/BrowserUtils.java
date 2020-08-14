package com.Nhs.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class BrowserUtils {


    /**
     * return a list of string from a list of elements
     *
     * @param list of webelements
     * @return list of string
     */
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    /**
     * Extracts text from list of elements matching the provided locator into new List<String>
     *
     * @param locator
     * @return list of strings
     */
    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.get().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    /**
     * Performs a pause
     *
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Moves the mouse to given element
     *
     * @param element on which to hover
     */
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }
    public static void waitForElementVisibleLocated (By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public static void waitForElementVisible (WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30, 200);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public static void waitForElementClickable (WebElement element,int waitTimeSecond) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), waitTimeSecond, 200);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }



}