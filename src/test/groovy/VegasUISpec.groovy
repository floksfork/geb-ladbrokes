import pages.VegasPage
import spock.lang.Ignore

/**
 * Created by Konfferance on 03.06.2015.
 */

@Ignore
class VegasUISpec extends UISpec {

    def "current page is vegas"() {
        expect:
        atHomePage()
        selectedTopMenu.text().trim().toLowerCase() == "vegas"
    }

    @Override
    void atHomePage() {
        at VegasPage
    }
}
