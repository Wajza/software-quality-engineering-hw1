# Campus Marketplace

Campus Marketplace is a Java-based software project developed for SWE 439: Software Quality Engineering Homework 1. The project is used to evaluate AI-assisted code-smell detection against the PMD static-analysis tool.

## Purpose of the Project

This project was generated for the experiment. Code smells were intentionally introduced into the source code so that their detection by PMD and the selected LLMs could be evaluated.

## Project Information

- Language: Java
- Build system: Maven
- Source files: 15 Java files
- Source LOC: 1,048 lines of code
- LOC tool: `cloc v2.10`
- LOC scope: `src` directory only

Blank lines, comments, and the `pom.xml` configuration file were excluded from the source-code LOC count.

## Requirements

- Java 21.0.1 or compatible Java version
- Maven
- PMD 7.29.0-SNAPSHOT

## Build the Project

From the project root, run:

```bash
mvn clean package
```

## Static Analysis

The project uses PMD as the baseline static-analysis tool. PMD was executed through the command line using Windows PowerShell. The selected PMD ruleset and rule thresholds should be documented with the experiment results.

## Experiment

The experiment compares PMD detections with detections produced by two LLMs:

- OpenAI GPT, model `GPT-6.1 Sol`
- DeepSeek, model `DeepSeek-V4.1-Flash-1017`

Each LLM is run three times with the same prompt and source-code scope. Run 1 is compared directly with PMD, while Runs 1–3 are used to measure detection consistency.

## Authors

- Wajd Alghamdi
- Raneem Alshahrani

## Course

SWE 439: Software Quality Engineering  
King Fahd University of Petroleum and Minerals
