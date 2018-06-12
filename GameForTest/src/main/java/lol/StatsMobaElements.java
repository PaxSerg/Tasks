package lol;

import java.util.HashMap;
import java.util.Map;

public class StatsMobaElements {
    static Map<String, String> HOME_PAGE = new HashMap<String, String>() {
        {
            put("Input Search", "//input");
            put("Selector for region", "//div[contains(@class, 'start-page-searchstyles__Region')]");
            put("Button Go", "//div[contains(@class, 'start-page-searchstyles__Region')]/../..//button");

            put("What we found", "//div[@class='start-page-searchstyles__SearchResultsPanelStyled-no1e4h-6 ektQeF']/div[1]//span");
            put("Recent", "//div[@class='start-page-searchstyles__SearchResultsPanelStyled-no1e4h-6 ektQeF']/div[2]//span");
        }
    };

    static Map<String, String> NAVBAR = new HashMap<String, String>() {
        {
            put("navbar homepage link", "//div[@class='header-gamesstyles__LogoStyled-s1lqa2u4-2 fPEpOj']/..");

            put("navbar Download link", "//nav[@class='menustyles__WrapperStyled-s1ta8imn-0 jZYnPU']//a[1]");
            put("navbar ProvingGround link", "//nav[@class='menustyles__WrapperStyled-s1ta8imn-0 jZYnPU']//a[2]");
            put("navbar Blog link", "//nav[@class='menustyles__WrapperStyled-s1ta8imn-0 jZYnPU']//a[3]");

            put("navbar Profile link", "//nav[@class='header-menustyles__MenuNavStyled-s584mex-3 eVRuTy']/div[1]//span");
            put("navbar GPI link", "//nav[@class='header-menustyles__MenuNavStyled-s584mex-3 eVRuTy']/div[2]//span");
            put("navbar PreGame link", "//nav[@class='header-menustyles__MenuNavStyled-s584mex-3 eVRuTy']/div[3]//span");
            put("navbar PostGame link", "//nav[@class='header-menustyles__MenuNavStyled-s584mex-3 eVRuTy']/div[4]//span");

            put("navbar search link", "//div[@class='header-menustyles__OtherLinksStyled-s584mex-9 dXnczM']/div");
            put("navbar login button", "//div[@class='header-menustyles__OtherLinksStyled-s584mex-9 dXnczM']/button");
        }
    };

    static Map<String, String> SIGN_IN_POPUP = new HashMap<String, String>() {
        {
            put("sign-in popup email", "//input[@id='email']");
            put("sign-in popup password", "//input[@id='password']");
            put("sign-in popup title", "//p[contains(@class, 'authstyles__HeaderTitle')]");
            //самый ужасный xpath!!!
            put("sign-in close", "//*[@version='1.1']");
        }
    };

    static Map<String, String> SEARCH_POPUP = new HashMap<String, String>() {
        {
            put("search popup message: What are you trying to find", "//*[text()='What are you trying to find?']");
        }
    };

    static Map<String, String> PROFILE = new HashMap<String, String>() {
        {
            put("profile summoner name", "//*[contains(@class, 'profilestyles__SummonerName')]");
            put("profile icon", "//*[contains(@class, 'profilestyles__SummonerIcon')]//img");
        }
    };

        private StatsMobaElements() {
        }
    }