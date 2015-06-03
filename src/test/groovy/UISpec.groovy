import geb.spock.GebSpec

/**
 * Created by Konfferance on 03.06.2015.
 */
abstract class UISpec extends GebSpec{

    def "Open home page"() {
        go "http://casino.ladbrokes.com/en"

        expect:
        atHomePage()
    }

    def "'Contact-us' is displayed"() {
        expect:
        atHomePage()
        waitFor { contactUs.displayed }
    }

    def "'Help' is displayed"() {
        expect:
        atHomePage()
        waitFor { help.displayed }
    }

    def "'Date & Time' is displayed" () {
        expect:
        atHomePage()
        waitFor { dateTime.displayed }
    }

    def "'Lang-selector' is displayed" () {
        expect:
        atHomePage()
        waitFor { langSelector.displayed }
    }

    def "'Logo' is displayed" (){
        expect:
        atHomePage()
        waitFor { logo.displayed }
    }

    def "'Banking' is displayed" (){
        expect:
        atHomePage()
        waitFor { banking.displayed }
    }
    def "'Username' is displayed" (){
        expect:
        atHomePage()
        waitFor { username.displayed }
    }

    def "'Password' is displayed" (){
        expect:
        atHomePage()
        waitFor { password.displayed }
    }

    def "'Login-button' is displayed" (){
        expect:
        atHomePage()
        waitFor { loginBtn.displayed }
    }

    def "'Join-button' is displayed" (){
        expect:
        atHomePage()
        waitFor { joinBtn.displayed }
    }

    def "'Forgot-password-link' is displayed" (){
        expect:
        atHomePage()
        waitFor { forgotPass.displayed }
    }

    def "'Search-games' is displayed" (){
        expect:
        atHomePage()
        waitFor { searchGames.displayed }
    }

   abstract void atHomePage()
}