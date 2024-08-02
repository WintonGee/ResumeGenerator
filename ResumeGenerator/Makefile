.PHONY: all clean

all: compile run open

compile:
	javac -d out src/main/java/com/example/Main.java src/main/java/com/example/util/LatexUtils.java src/main/java/com/example/generators/HeaderGenerator.java src/main/java/com/example/generators/EducationGenerator.java

run:
	java -cp out com.example.Main

open:
	open output/resume.pdf

clean:
	rm -rf out output/resume.pdf output/resume.tex
