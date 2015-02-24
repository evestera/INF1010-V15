# Slides

- [Exceptions / try-catch](https://slides.com/evestera/feilmeldinger-i-java)

# Linker

- [Facebook-gruppe](https://www.facebook.com/groups/770233566394868/)
- [Emne-sida](http://www.uio.no/studier/emner/matnat/ifi/INF1010/v15/)
- [Java 8 API](http://docs.oracle.com/javase/8/docs/api/) (Men for å søke bruk Google: "java 8 *klassenavn*")
- [Java REPL](http://www.javarepl.com/console.html)
- [Astah UML](http://astah.net)

# Hvordan kjøre javadoc

```bash
javadoc -d javadoc -linkoffline http://docs.oracle.com/javase/8/docs/api/ http://docs.oracle.com/javase/8/docs/api/ *.java
```

# Hvordan få en kopi av java-kildekoden

```bash
# På mac, kopierer zipfila med kildekoden til hjemmemappa di:
cp $(/usr/libexec/java_home)/src.zip ~

# På IFI-serverne, kopierer zipfila med kildekoden til hjemmemappa di:
cp /snacks/encap/jdk-1.8.0.31+1/opt/jdk/src.zip ~
```

# Bok

Josh Bloch - Effective Java