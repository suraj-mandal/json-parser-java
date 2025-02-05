all: build_target generate_image clean

build_target:
	@echo "Generating the jar"
	./gradlew jar
	jar tf build/libs/json-parser.jar

generate_image:
	rm -rf dist
	mkdir dist
	@echo "Generating the native image of the jar file"
	native-image -jar build/libs/json-parser.jar dist/json-parser

clean:
	@echo "Cleaning up the generated jar"
	rm build/libs/*.jar