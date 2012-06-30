# unfiltered bench

some scripts and sample servers for benchmarking unfiltered static resource serving servers

# setup

if testing jar'r resources, jar up your deps with

    sbt assembly

install tooling

via [homebrew](https://github.com/mxcl/homebrew)

    brew install -v gnuplot

# usage

run netty server on port 8080

    sbt "run netty"

run ab test on netty

    ab -n 8000 -c 100 -g netty.dat http://127.0.0.1:8080/css/app.css

shutdown netty

run jetty server on port 8080

    sbt "run jetty"

run ab test on jetty

    ab -n 8000 -c 100 -g jetty.dat http://127.0.0.1:8080/css/app.css

generate the ab graph `out.png`

    gnuplot ./scripts/ab_plot.p

2012 Doug Tangren (softprops)
