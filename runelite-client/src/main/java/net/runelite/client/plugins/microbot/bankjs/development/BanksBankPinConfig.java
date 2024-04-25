package net.runelite.client.plugins.microbot.bankjs.development;

import net.runelite.client.config.*;

@ConfigGroup("example")
public interface BanksBankPinConfig extends Config {

    @ConfigSection(
            name = "Item Settings",
            description = "Set Items to Combine",
            position = 0,
            closedByDefault = false
    )
    String itemSection = "itemSection";

    // Items
    @ConfigItem(
            keyName = "First Item ID",
            name = "First Item ID",
            description = "Sets First Item ID",
            position = 0,
            section = itemSection
    )
    @Range(
            min = 0,
            max = 99999
    )

    default int firstItemId() {
        return 0;
    }

    @ConfigItem(
            keyName = "First Item Quantity",
            name = "First Item Quantity",
            description = "Sets First Item's Quantity.",
            position = 0,
            section = itemSection
    )
    @Range(
            min = 1,
            max = 28
    )

    default int firstItemQuantity() {
        return 1;
    }

    @ConfigItem(
            keyName = "Second Item ID",
            name = "Second Item ID",
            description = "Sets Second Item ID",
            position = 0,
            section = itemSection
    )
    @Range(
            min = 0,
            max = 99999
    )

    default int secondItemId() {
        return 0;
    }

    @ConfigItem(
            keyName = "Second Item Quantity",
            name = "Second Item Quantity",
            description = "Sets Second Item's Quantity.",
            position = 0,
            section = itemSection
    )
    @Range(
            min = 1,
            max = 28
    )

    default int secondItemQuantity() {
        return 1;
    }

    @ConfigSection(
            name = "Sleep Settings",
            description = "Set Sleep Settings",
            position = 1,
            closedByDefault = false
    )
    String sleepSection = "sleepSection";

    @ConfigItem(
            keyName = "Sleep Min",
            name = "Sleep Min",
            description = "Sets the minimum sleep time.",
            position = 0,
            section = sleepSection
    )
    @Range(
            min = 0,
            max = 20000
    )

    default int sleepMin() {
        return 0;
    }

    @ConfigItem(
            keyName = "Sleep Max",
            name = "Sleep Max",
            description = "Sets the maximum sleep time.",
            position = 0,
            section = sleepSection
    )
    @Range(
            min = 0,
            max = 20000
    )

    default int sleepMax() {
        return 1800;
    }

    @ConfigItem(
            keyName = "Sleep Target",
            name = "Sleep Target",
            description = "This is the Target or Mean of the distribution.",
            position = 0,
            section = sleepSection
    )
    @Range(
            min = 0,
            max = 20000
    )

    default int sleepTarget() {
        return 900;
    }

    @ConfigItem(
            keyName = "Instructions",
            name = "Instructions",
            description = "Instructions",
            position = 1,
            section = sleepSection
    )
    default String basicInstructions() {
        return "This Script will combine items for you" +
                "\n If using a Knife etc. make sure qty is set to 1. and use Item Slot 1." +
                "\nChisel Item ID = 1755" +
                "\nKnife Item ID = 946" +
                "\nGlassblowing Pipe Item ID = 1785" +
                "\nFor Bug reports & Future updates, my discord is Bank.js" +
                "\nor find my in the Microbot discord."
                ;
    }


}
