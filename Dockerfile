FROM openjdk:8

ADD build/distributions/briks-0.1.0-SNAPSHOT.tar /

CMD /briks-0.1.0-SNAPSHOT/bin/briks

EXPOSE 9000