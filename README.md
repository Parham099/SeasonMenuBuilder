# SeasonMenuBuilder Wiki

Welcome to the official documentation for **SeasonMenuBuilder**.

SeasonMenuBuilder is a Kotlin DSL library for creating Minecraft GUI menus on Paper servers. It focuses on simplicity, readability, and flexibility while keeping the API clean.

---

# Contents

- [Installation](Installation)
- [Creating Your First Menu](Creating-Your-First-Menu)
- [Items](Items)
- [Item Events](Item-Events)
- [Menu Events](Menu-Events)
- [Menu Types](Menu-Types)
- [Advanced](Advanced)
- [Examples](Examples)
- [FAQ](FAQ)

---

# Features

- Kotlin DSL
- Clean and readable syntax
- Static menus
- Dynamic menus
- Adventure Component support
- MiniMessage support
- Multiple click events
- Per-item event handlers
- Menu-wide event handlers
- Custom item IDs
- Multiple slot support
- Paper API compatible

---

# Basic Example

```kotlin
val menu = menu("Example Menu", 27) {

    stone(listOf(13)) {
        displayName = mm("<green>Hello!")

        onClick {
            it.whoClicked.sendMessage(
                mm("<yellow>You clicked the stone!")
            )
        }
    }

}
```

Open it:

```kotlin
player.openGui(menu)
```

---

# Menu Sizes

You can create a menu with any valid inventory size.

```kotlin
menu("Example", 27) {

}
```

or use the predefined builders.

```kotlin
menu9("Menu") {

}

menu18("Menu") {

}

menu27("Menu") {

}

menu36("Menu") {

}

menu45("Menu") {

}

menu54("Menu") {

}
```

---

# Menu Types

SeasonMenuBuilder supports two menu types.

## Dynamic

A new Bukkit inventory is created every time the menu is opened.

Recommended when:

- Contents change frequently
- Player-specific data
- Database values
- Economy values
- Live statistics

```kotlin
menu(
    title = "Dynamic",
    size = 27,
    menuType = MenuType.DYNAMIC
) {

}
```

---

## Static

The inventory is created only once and reused.

Recommended when:

- Decoration menus
- Static shops
- Help menus
- Information menus

```kotlin
menu(
    title = "Static",
    size = 27,
    menuType = MenuType.STATIC
) {

}
```

---

# Creating Items

Every menu consists of items.

Example:

```kotlin
menu("Example", 27) {

    item(
        material = Material.STONE,
        slots = listOf(13)
    ) {

    }

}
```

See the **Items** page for all available item properties.

---

# Events

Both menus and items support event handlers.

Menu:

```kotlin
onOpen {

}

onClose {

}

onClick {

}

onLeftClick {

}

onRightClick {

}

onShiftClick {

}
```

Item:

```kotlin
stone(10) {

    onClick {

    }

    onLeftClick {

    }

    onRightClick {

    }

    onShiftClick {

    }

}
```

Detailed explanations are available in:

- Item-Events
- Menu-Events

---

# Opening a Menu

Simply call:

```kotlin
player.openGui(menu)
```

The library automatically manages the opened menu for each player.

---

# Adventure Support

SeasonMenuBuilder uses Adventure Components.

Example:

```kotlin
displayName = Component.text("Hello")
```

or with MiniMessage:

```kotlin
displayName = mm("<gradient:red:gold>Hello</gradient>")
```

---

Full Wiki: https://github.com/Parham099/SeasonMenuBuilder/wiki
