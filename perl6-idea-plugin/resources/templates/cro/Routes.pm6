use Cro::HTTP::Router;$$WS_IMPORT$$$$CROTMP_IMPORT$$

sub routes() is export {
    route {
        get -> {
            content 'text/html', "<h1> Cro::Test </h1>";
        }$$WS_ROUTE$$$$CROTMP_ROUTE$$
    }
}
