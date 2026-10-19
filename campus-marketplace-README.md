# Campus Marketplace Java Application

This is an original Java console application for the SWE 439 code-smell experiment. It models users, products, orders, reviews, messages, notifications, and marketplace reporting.

## Code smells intentionally included

- **Long Method:** `MarketplaceManager.processOrder` combines validation, pricing, tax, persistence, notification, and receipt formatting.
- **Large Class:** `MarketplaceManager` combines user, product, order, review, messaging, notification, and reporting responsibilities.
- **Duplicate Code:** `MarketplaceManager.onlineReceipt` and `MarketplaceManager.pickupReceipt` repeat receipt formatting.
- **Long Parameter List:** `AdditionalSmellExamples.registerStudent` receives twelve separate arguments.
- **Data Clumps:** address and emergency-contact values travel together as separate parameters.
- **Primitive Obsession:** `calculateFee` represents domain concepts using raw strings and numbers.
- **Feature Envy:** `describeProductForBuyer` mainly reads fields from `Product` and `User`.
- **Message Chain:** `sellerEmail` navigates through manager, product, user, and email data.
- **Middle Man:** several methods only delegate to service objects.
- **Shotgun Surgery:** tax logic and labels are repeated across five methods.
- **Divergent Change:** `AdditionalSmellExamples` changes for authentication, pricing, promotions, and reporting reasons.
- **Lazy Class:** `ProductCounter` adds almost no behavior beyond `ProductService.count`.
- **Data Class:** `SearchCriteria` contains fields and getters/setters without behavior.
- **Inappropriate Intimacy:** `canBuy` directly inspects another object's internal state.
- **Speculative Generality:** `convertForFutureIntegration` provides unused future-oriented abstraction.

## LOC calculation

LOC was calculated as physical Java source lines, including code, comments, and blank lines, using:

```bash
find src/main/java -name '*.java' -print0 | xargs -0 wc -l
```

The project contains **1,022 Java physical LOC**. For a stricter non-blank LOC count, use a documented tool such as `cloc` and report its result separately.

## Run from Windows Command Prompt

1. Open Command Prompt.

2. Navigate to the extracted project folder. Replace the path with the actual location on your computer:

```cmd
cd /d "C:\path\to\campus-marketplace"
```

3. Verify that Java and the Java compiler are installed:

```cmd
java -version
javac -version
```

The project requires JDK 17 or later. If either command is not recognized, install the JDK and reopen Command Prompt.

4. Create a list of all Java source files:

```cmd
dir /s /b src\main\java\*.java > sources.txt
```

5. Create the compilation output folder:

```cmd
mkdir out
```

6. Compile the project:

```cmd
javac -d out @sources.txt
```

7. Run the application:

```cmd
java -cp out edu.kfupm.marketplace.App
```

The application should display a sample marketplace order receipt and a marketplace report.
