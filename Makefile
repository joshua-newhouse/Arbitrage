JC = javac
JFLAGS = -Xlint
OBJ = Driver.class Coins.class ExchangeRate.class CryptoGraph.class

all: $(OBJ)

%.class: %.java
	$(JC) $(JFLAGS) $<

clean:
	rm -f *.class
