package pages

import geb.Page

/**
 * Created by Konfferance on 03.06.2015.
 */
class HomePage extends Page {

    static content = {

        // Header ui items
        contactUs { $("div", id : "column-3").find("a", title : "Contact us")}
        help {$("div", id : "column-3").find("a", class : "help-link-adjustment")}
        dateTime { $("div", id : "column-3").find("div", id : "date")}
        langSelector { $("div", id : "column-3").find("div", class : "wrap-languageSelector").find("ul", class : "lang-select-box") }

        logo { $("div", id : "column-1").find ("a", class : "logo default-logo")}
        banking { $("a", class : "head-rnd banking hidden-on-sso")}

        //Login form
        username { $("input", name : "username")}
        password { $("input", name : "password")}
        loginBtn { $("form", id : "login" ).$("button", type : "submit")}

        joinBtn { $("a", class : "btn btn-join")}

        forgotPass { $("a", id : "forgot-password-link")}

        selectedTopMenu { $("div", id : "navigation").find("li", class : "active")}

        searchGames { $("div", class : "search-games-portlet field-search-wrapper").$("input", name : "search")}
    }
}
