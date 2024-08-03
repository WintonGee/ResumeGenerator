# Find all Java source files in src/main/java and ResumeGenerator/data
SOURCES := $(shell find src/main/java -name '*.java')

# Output directory
OUT_DIR := out

# Compile all Java source files
all: $(OUT_DIR)
	make clean
	javac -d $(OUT_DIR) $(SOURCES)
	java -cp $(OUT_DIR) com.example.Main

# Create the output directory
$(OUT_DIR):
	mkdir -p $(OUT_DIR)

# Clean up build artifacts
clean:
	rm -rf $(OUT_DIR)
	rm -f output/resume.tex output/resume.pdf

# Run the main class
run:
	java -cp $(OUT_DIR) com.example.Main

# Open the generated PDF
open:
	open output/resume.pdf
