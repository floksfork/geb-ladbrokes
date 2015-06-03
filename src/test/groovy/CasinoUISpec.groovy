import pages.CasinoPage

/**
 * Created by Konfferance on 03.06.2015.
 */
class CasinoUISpec extends UISpec {

    def "current page is casino"() {
        expect:
        atHomePage()
        selectedTopMenu.text().trim().toLowerCase() == "casino"
    }

    @Override
    void atHomePage() {
        at CasinoPage
    }
}
