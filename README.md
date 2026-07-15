# Installation

SeasonMenuBuilder supports **Paper** servers and is designed primarily for **Kotlin** projects.

---

# Requirements

| Requirement | Version |
|-------------|----------|
| Java | 21+ |
| Kotlin | 2.4+ |
| Paper | 1.21.6 or lower |

---

**Replace `Tag` with version tagname in github**

# Maven

```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>

<dependencies>

    <dependency>
	    <groupId>com.github.Parham099</groupId>
	    <artifactId>SeasonMenuBuilder</artifactId>
	    <version>Tag</version>
    </dependency>

</dependencies>
```

---

# Gradle (Kotlin DSL)

```kotlin
dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		mavenCentral()
		maven { url = uri("https://jitpack.io") }
	}
}

dependencies {
	implementation("com.github.Parham099:SeasonMenuBuilder:Tag")
}
```

---

# Gradle (Groovy)

```groovy
dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		mavenCentral()
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
	implementation 'com.github.Parham099:SeasonMenuBuilder:Tag'
}
```

---

# Shadow Plugin

If your plugin is written in Kotlin, it is recommended to **shade** SeasonMenuBuilder into your plugin.

Gradle example:

```kotlin
dependencies {
	implementation("com.github.Parham099:SeasonMenuBuilder:Tag")
}

```

---

# Installation in plugin

```kotlin
// Use this in you plugin to use Gui this is very important!!!
SeasonMenuBuilder(instance as JavaPlugin)
```

If register in onEnable method use this

```kotlin
// Use this in you plugin to use Gui this is very important!!!
SeasonMenuBuilder(this)
```

---

# Kotlin DSL

SeasonMenuBuilder is built around a Kotlin DSL.

A simple menu looks like this:

```kotlin
val menu = staticMenu("Example", 27) {

}
```

Menus, items and events are configured inside the DSL block.

---

# Your First Menu

```kotlin
val menu = staticMenu("Hello", 27) {

}
```

Open it:

```kotlin
player.openGui(menu)
```

That's all you need to display your first GUI.

---

# Adventure Components

SeasonMenuBuilder uses Adventure Components instead of legacy color codes.

Example:

```kotlin
displayName = Component.text("Hello")
```

MiniMessage is also supported:

```kotlin
displayName = mm("<green>Hello World!")
```

---

# Inventory Sizes

You can create inventories using the generic builder:

```kotlin
staticMenu("Menu", 9) {

}
```

---

# Menu Types

Every menu can be either **Dynamic** or **Static**.

Dynamic:

```kotlin
dynamicMenu(
    title = "Example",
    size = 27
) {

}
```

Static:

```kotlin
staticMenu(
    title = "Example",
    size = 27
) {

}
```

Read more in the **Menu-Types** page.

---

# Project Structure

A recommended project structure:

```
plugin
│
├── commands
├── listeners
├── menus
│   ├── MainMenu.kt
│   ├── ShopMenu.kt
│   ├── SettingsMenu.kt
│   └── AdminMenu.kt
│
└── Plugin.kt
```

Keeping every menu in its own file makes projects much easier to maintain.

---
