package ir.parham099.seasonMenuBuilder.dsl

import org.bukkit.Material
import ir.parham099.seasonMenuBuilder.builder.BaseMenuBuilder
import ir.parham099.seasonMenuBuilder.item.MenuItem

fun BaseMenuBuilder.acaciaBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_BOAT, slots.toList(), block)

fun BaseMenuBuilder.acaciaChestBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_CHEST_BOAT, slots.toList(), block)

fun BaseMenuBuilder.air(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.AIR, slots.toList(), block)

fun BaseMenuBuilder.allaySpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ALLAY_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.amethystShard(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.AMETHYST_SHARD, slots.toList(), block)

fun BaseMenuBuilder.anglerPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ANGLER_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.apple(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.APPLE, slots.toList(), block)

fun BaseMenuBuilder.archerPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ARCHER_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.armadilloScute(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ARMADILLO_SCUTE, slots.toList(), block)

fun BaseMenuBuilder.armadilloSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ARMADILLO_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.armorStand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ARMOR_STAND, slots.toList(), block)

fun BaseMenuBuilder.armsUpPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ARMS_UP_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.arrow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ARROW, slots.toList(), block)

fun BaseMenuBuilder.axolotlBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.AXOLOTL_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.axolotlSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.AXOLOTL_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.bakedPotato(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAKED_POTATO, slots.toList(), block)

fun BaseMenuBuilder.bambooChestRaft(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_CHEST_RAFT, slots.toList(), block)

fun BaseMenuBuilder.bambooRaft(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_RAFT, slots.toList(), block)

fun BaseMenuBuilder.batSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAT_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.beeSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.beef(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEEF, slots.toList(), block)

fun BaseMenuBuilder.beetroot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEETROOT, slots.toList(), block)

fun BaseMenuBuilder.beetrootSeeds(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEETROOT_SEEDS, slots.toList(), block)

fun BaseMenuBuilder.beetrootSoup(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEETROOT_SOUP, slots.toList(), block)

fun BaseMenuBuilder.birchBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_BOAT, slots.toList(), block)

fun BaseMenuBuilder.birchChestBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_CHEST_BOAT, slots.toList(), block)

fun BaseMenuBuilder.blackBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.blackDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_DYE, slots.toList(), block)

fun BaseMenuBuilder.blackHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.bladePotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLADE_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.blazePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLAZE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.blazeRod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLAZE_ROD, slots.toList(), block)

fun BaseMenuBuilder.blazeSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLAZE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.blueBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.blueDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_DYE, slots.toList(), block)

fun BaseMenuBuilder.blueEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_EGG, slots.toList(), block)

fun BaseMenuBuilder.blueHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.boggedSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BOGGED_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.boltArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.bone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BONE, slots.toList(), block)

fun BaseMenuBuilder.boneMeal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BONE_MEAL, slots.toList(), block)

fun BaseMenuBuilder.book(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BOOK, slots.toList(), block)

fun BaseMenuBuilder.bordureIndentedBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BORDURE_INDENTED_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.bow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BOW, slots.toList(), block)

fun BaseMenuBuilder.bowl(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BOWL, slots.toList(), block)

fun BaseMenuBuilder.bread(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BREAD, slots.toList(), block)

fun BaseMenuBuilder.breezeRod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BREEZE_ROD, slots.toList(), block)

fun BaseMenuBuilder.breezeSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BREEZE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.brewerPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BREWER_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.brick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRICK, slots.toList(), block)

fun BaseMenuBuilder.brownBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.brownDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_DYE, slots.toList(), block)

fun BaseMenuBuilder.brownEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.brownHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.brush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRUSH, slots.toList(), block)

fun BaseMenuBuilder.bucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BUCKET, slots.toList(), block)

fun BaseMenuBuilder.bundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.burnPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BURN_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.camelSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CAMEL_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.carrot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CARROT, slots.toList(), block)

fun BaseMenuBuilder.carrotOnAStick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CARROT_ON_A_STICK, slots.toList(), block)

fun BaseMenuBuilder.catSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CAT_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.caveSpiderSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CAVE_SPIDER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.chainmailBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHAINMAIL_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.chainmailChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHAINMAIL_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.chainmailHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHAINMAIL_HELMET, slots.toList(), block)

fun BaseMenuBuilder.chainmailLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHAINMAIL_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.charcoal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHARCOAL, slots.toList(), block)

fun BaseMenuBuilder.cherryBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_BOAT, slots.toList(), block)

fun BaseMenuBuilder.cherryChestBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_CHEST_BOAT, slots.toList(), block)

fun BaseMenuBuilder.chestMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHEST_MINECART, slots.toList(), block)

fun BaseMenuBuilder.chicken(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHICKEN, slots.toList(), block)

fun BaseMenuBuilder.chickenSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHICKEN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.chorusFruit(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHORUS_FRUIT, slots.toList(), block)

fun BaseMenuBuilder.clayBall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CLAY_BALL, slots.toList(), block)

fun BaseMenuBuilder.clock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CLOCK, slots.toList(), block)

fun BaseMenuBuilder.coal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COAL, slots.toList(), block)

fun BaseMenuBuilder.coastArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.cocoaBeans(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COCOA_BEANS, slots.toList(), block)

fun BaseMenuBuilder.cod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COD, slots.toList(), block)

fun BaseMenuBuilder.codBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COD_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.codSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COD_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.commandBlockMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COMMAND_BLOCK_MINECART, slots.toList(), block)

fun BaseMenuBuilder.compass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COMPASS, slots.toList(), block)

fun BaseMenuBuilder.cookedBeef(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COOKED_BEEF, slots.toList(), block)

fun BaseMenuBuilder.cookedChicken(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COOKED_CHICKEN, slots.toList(), block)

fun BaseMenuBuilder.cookedCod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COOKED_COD, slots.toList(), block)

fun BaseMenuBuilder.cookedMutton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COOKED_MUTTON, slots.toList(), block)

fun BaseMenuBuilder.cookedPorkchop(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COOKED_PORKCHOP, slots.toList(), block)

fun BaseMenuBuilder.cookedRabbit(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COOKED_RABBIT, slots.toList(), block)

fun BaseMenuBuilder.cookedSalmon(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COOKED_SALMON, slots.toList(), block)

fun BaseMenuBuilder.cookie(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COOKIE, slots.toList(), block)

fun BaseMenuBuilder.copperIngot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COPPER_INGOT, slots.toList(), block)

fun BaseMenuBuilder.cowSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COW_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.creakingSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CREAKING_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.creeperBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CREEPER_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.creeperSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CREEPER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.crossbow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CROSSBOW, slots.toList(), block)

fun BaseMenuBuilder.cyanBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.cyanDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_DYE, slots.toList(), block)

fun BaseMenuBuilder.cyanHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.dangerPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DANGER_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.darkOakBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_BOAT, slots.toList(), block)

fun BaseMenuBuilder.darkOakChestBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_CHEST_BOAT, slots.toList(), block)

fun BaseMenuBuilder.debugStick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEBUG_STICK, slots.toList(), block)

fun BaseMenuBuilder.diamond(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND, slots.toList(), block)

fun BaseMenuBuilder.diamondAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_AXE, slots.toList(), block)

fun BaseMenuBuilder.diamondBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.diamondChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.diamondHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_HELMET, slots.toList(), block)

fun BaseMenuBuilder.diamondHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_HOE, slots.toList(), block)

fun BaseMenuBuilder.diamondHorseArmor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_HORSE_ARMOR, slots.toList(), block)

fun BaseMenuBuilder.diamondLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.diamondPickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.diamondShovel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_SHOVEL, slots.toList(), block)

fun BaseMenuBuilder.diamondSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_SWORD, slots.toList(), block)

fun BaseMenuBuilder.discFragment5(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DISC_FRAGMENT_5, slots.toList(), block)

fun BaseMenuBuilder.dolphinSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DOLPHIN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.donkeySpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DONKEY_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.dragonBreath(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DRAGON_BREATH, slots.toList(), block)

fun BaseMenuBuilder.driedKelp(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DRIED_KELP, slots.toList(), block)

fun BaseMenuBuilder.drownedSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DROWNED_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.duneArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.echoShard(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ECHO_SHARD, slots.toList(), block)

fun BaseMenuBuilder.egg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EGG, slots.toList(), block)

fun BaseMenuBuilder.elderGuardianSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ELDER_GUARDIAN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.elytra(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ELYTRA, slots.toList(), block)

fun BaseMenuBuilder.emerald(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EMERALD, slots.toList(), block)

fun BaseMenuBuilder.enchantedBook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ENCHANTED_BOOK, slots.toList(), block)

fun BaseMenuBuilder.enchantedGoldenApple(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ENCHANTED_GOLDEN_APPLE, slots.toList(), block)

fun BaseMenuBuilder.endCrystal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_CRYSTAL, slots.toList(), block)

fun BaseMenuBuilder.enderDragonSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ENDER_DRAGON_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.enderEye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ENDER_EYE, slots.toList(), block)

fun BaseMenuBuilder.enderPearl(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ENDER_PEARL, slots.toList(), block)

fun BaseMenuBuilder.endermanSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ENDERMAN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.endermiteSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ENDERMITE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.evokerSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EVOKER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.experienceBottle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPERIENCE_BOTTLE, slots.toList(), block)

fun BaseMenuBuilder.explorerPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPLORER_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.eyeArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.feather(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FEATHER, slots.toList(), block)

fun BaseMenuBuilder.fermentedSpiderEye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FERMENTED_SPIDER_EYE, slots.toList(), block)

fun BaseMenuBuilder.fieldMasonedBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIELD_MASONED_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.filledMap(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FILLED_MAP, slots.toList(), block)

fun BaseMenuBuilder.fireCharge(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIRE_CHARGE, slots.toList(), block)

fun BaseMenuBuilder.fireworkRocket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIREWORK_ROCKET, slots.toList(), block)

fun BaseMenuBuilder.fireworkStar(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIREWORK_STAR, slots.toList(), block)

fun BaseMenuBuilder.fishingRod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FISHING_ROD, slots.toList(), block)

fun BaseMenuBuilder.flint(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLINT, slots.toList(), block)

fun BaseMenuBuilder.flintAndSteel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLINT_AND_STEEL, slots.toList(), block)

fun BaseMenuBuilder.flowArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.flowBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLOW_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.flowPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLOW_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.flowerBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLOWER_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.foxSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FOX_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.friendPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FRIEND_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.frogSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FROG_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.furnaceMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FURNACE_MINECART, slots.toList(), block)

fun BaseMenuBuilder.ghastSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GHAST_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.ghastTear(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GHAST_TEAR, slots.toList(), block)

fun BaseMenuBuilder.glassBottle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLASS_BOTTLE, slots.toList(), block)

fun BaseMenuBuilder.glisteringMelonSlice(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLISTERING_MELON_SLICE, slots.toList(), block)

fun BaseMenuBuilder.globeBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLOBE_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.glowBerries(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLOW_BERRIES, slots.toList(), block)

fun BaseMenuBuilder.glowInkSac(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLOW_INK_SAC, slots.toList(), block)

fun BaseMenuBuilder.glowItemFrame(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLOW_ITEM_FRAME, slots.toList(), block)

fun BaseMenuBuilder.glowSquidSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLOW_SQUID_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.glowstoneDust(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLOWSTONE_DUST, slots.toList(), block)

fun BaseMenuBuilder.goatHorn(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOAT_HORN, slots.toList(), block)

fun BaseMenuBuilder.goatSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOAT_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.goldIngot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLD_INGOT, slots.toList(), block)

fun BaseMenuBuilder.goldNugget(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLD_NUGGET, slots.toList(), block)

fun BaseMenuBuilder.goldenApple(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_APPLE, slots.toList(), block)

fun BaseMenuBuilder.goldenAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_AXE, slots.toList(), block)

fun BaseMenuBuilder.goldenBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.goldenCarrot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_CARROT, slots.toList(), block)

fun BaseMenuBuilder.goldenChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.goldenHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_HELMET, slots.toList(), block)

fun BaseMenuBuilder.goldenHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_HOE, slots.toList(), block)

fun BaseMenuBuilder.goldenHorseArmor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_HORSE_ARMOR, slots.toList(), block)

fun BaseMenuBuilder.goldenLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.goldenPickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.goldenShovel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_SHOVEL, slots.toList(), block)

fun BaseMenuBuilder.goldenSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLDEN_SWORD, slots.toList(), block)

fun BaseMenuBuilder.grayBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.grayDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_DYE, slots.toList(), block)

fun BaseMenuBuilder.grayHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.greenBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.greenDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_DYE, slots.toList(), block)

fun BaseMenuBuilder.greenHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.guardianSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GUARDIAN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.gunpowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GUNPOWDER, slots.toList(), block)

fun BaseMenuBuilder.gusterBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GUSTER_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.gusterPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GUSTER_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.happyGhastSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HAPPY_GHAST_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.heartOfTheSea(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HEART_OF_THE_SEA, slots.toList(), block)

fun BaseMenuBuilder.heartPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HEART_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.heartbreakPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HEARTBREAK_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.hoglinSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HOGLIN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.honeyBottle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HONEY_BOTTLE, slots.toList(), block)

fun BaseMenuBuilder.honeycomb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HONEYCOMB, slots.toList(), block)

fun BaseMenuBuilder.hopperMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HOPPER_MINECART, slots.toList(), block)

fun BaseMenuBuilder.horseSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HORSE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.hostArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HOST_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.howlPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HOWL_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.huskSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HUSK_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.inkSac(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.INK_SAC, slots.toList(), block)

fun BaseMenuBuilder.ironAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_AXE, slots.toList(), block)

fun BaseMenuBuilder.ironBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.ironChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.ironGolemSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_GOLEM_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.ironHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_HELMET, slots.toList(), block)

fun BaseMenuBuilder.ironHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_HOE, slots.toList(), block)

fun BaseMenuBuilder.ironHorseArmor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_HORSE_ARMOR, slots.toList(), block)

fun BaseMenuBuilder.ironIngot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_INGOT, slots.toList(), block)

fun BaseMenuBuilder.ironLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.ironNugget(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_NUGGET, slots.toList(), block)

fun BaseMenuBuilder.ironPickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.ironShovel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_SHOVEL, slots.toList(), block)

fun BaseMenuBuilder.ironSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_SWORD, slots.toList(), block)

fun BaseMenuBuilder.itemFrame(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ITEM_FRAME, slots.toList(), block)

fun BaseMenuBuilder.jungleBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_BOAT, slots.toList(), block)

fun BaseMenuBuilder.jungleChestBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_CHEST_BOAT, slots.toList(), block)

fun BaseMenuBuilder.knowledgeBook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.KNOWLEDGE_BOOK, slots.toList(), block)

fun BaseMenuBuilder.lapisLazuli(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LAPIS_LAZULI, slots.toList(), block)

fun BaseMenuBuilder.lavaBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LAVA_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.lead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEAD, slots.toList(), block)

fun BaseMenuBuilder.leather(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEATHER, slots.toList(), block)

fun BaseMenuBuilder.leatherBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEATHER_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.leatherChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEATHER_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.leatherHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEATHER_HELMET, slots.toList(), block)

fun BaseMenuBuilder.leatherHorseArmor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEATHER_HORSE_ARMOR, slots.toList(), block)

fun BaseMenuBuilder.leatherLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEATHER_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.lightBlueBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.lightBlueDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_DYE, slots.toList(), block)

fun BaseMenuBuilder.lightBlueHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.lightGrayBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.lightGrayDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_DYE, slots.toList(), block)

fun BaseMenuBuilder.lightGrayHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.limeBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.limeDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_DYE, slots.toList(), block)

fun BaseMenuBuilder.limeHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.lingeringPotion(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LINGERING_POTION, slots.toList(), block)

fun BaseMenuBuilder.llamaSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LLAMA_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.mace(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MACE, slots.toList(), block)

fun BaseMenuBuilder.magentaBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.magentaDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_DYE, slots.toList(), block)

fun BaseMenuBuilder.magentaHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.magmaCream(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGMA_CREAM, slots.toList(), block)

fun BaseMenuBuilder.magmaCubeSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGMA_CUBE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.mangroveBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_BOAT, slots.toList(), block)

fun BaseMenuBuilder.mangroveChestBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_CHEST_BOAT, slots.toList(), block)

fun BaseMenuBuilder.map(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAP, slots.toList(), block)

fun BaseMenuBuilder.melonSeeds(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MELON_SEEDS, slots.toList(), block)

fun BaseMenuBuilder.melonSlice(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MELON_SLICE, slots.toList(), block)

fun BaseMenuBuilder.milkBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MILK_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.minecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MINECART, slots.toList(), block)

fun BaseMenuBuilder.minerPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MINER_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.mojangBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOJANG_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.mooshroomSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOOSHROOM_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.mournerPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOURNER_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.muleSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MULE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.mushroomStew(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSHROOM_STEW, slots.toList(), block)

fun BaseMenuBuilder.musicDisc5(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_5, slots.toList(), block)

fun BaseMenuBuilder.musicDisc11(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_11, slots.toList(), block)

fun BaseMenuBuilder.musicDisc13(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_13, slots.toList(), block)

fun BaseMenuBuilder.musicDiscBlocks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_BLOCKS, slots.toList(), block)

fun BaseMenuBuilder.musicDiscCat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_CAT, slots.toList(), block)

fun BaseMenuBuilder.musicDiscChirp(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_CHIRP, slots.toList(), block)

fun BaseMenuBuilder.musicDiscCreator(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_CREATOR, slots.toList(), block)

fun BaseMenuBuilder.musicDiscCreatorMusicBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_CREATOR_MUSIC_BOX, slots.toList(), block)

fun BaseMenuBuilder.musicDiscFar(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_FAR, slots.toList(), block)

fun BaseMenuBuilder.musicDiscLavaChicken(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_LAVA_CHICKEN, slots.toList(), block)

fun BaseMenuBuilder.musicDiscMall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_MALL, slots.toList(), block)

fun BaseMenuBuilder.musicDiscMellohi(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_MELLOHI, slots.toList(), block)

fun BaseMenuBuilder.musicDiscOtherside(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_OTHERSIDE, slots.toList(), block)

fun BaseMenuBuilder.musicDiscPigstep(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_PIGSTEP, slots.toList(), block)

fun BaseMenuBuilder.musicDiscPrecipice(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_PRECIPICE, slots.toList(), block)

fun BaseMenuBuilder.musicDiscRelic(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_RELIC, slots.toList(), block)

fun BaseMenuBuilder.musicDiscStal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_STAL, slots.toList(), block)

fun BaseMenuBuilder.musicDiscStrad(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_STRAD, slots.toList(), block)

fun BaseMenuBuilder.musicDiscTears(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_TEARS, slots.toList(), block)

fun BaseMenuBuilder.musicDiscWait(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_WAIT, slots.toList(), block)

fun BaseMenuBuilder.musicDiscWard(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSIC_DISC_WARD, slots.toList(), block)

fun BaseMenuBuilder.mutton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUTTON, slots.toList(), block)

fun BaseMenuBuilder.nameTag(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NAME_TAG, slots.toList(), block)

fun BaseMenuBuilder.nautilusShell(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NAUTILUS_SHELL, slots.toList(), block)

fun BaseMenuBuilder.netherBrick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_BRICK, slots.toList(), block)

fun BaseMenuBuilder.netherStar(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_STAR, slots.toList(), block)

fun BaseMenuBuilder.netheriteAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_AXE, slots.toList(), block)

fun BaseMenuBuilder.netheriteBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.netheriteChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.netheriteHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_HELMET, slots.toList(), block)

fun BaseMenuBuilder.netheriteHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_HOE, slots.toList(), block)

fun BaseMenuBuilder.netheriteIngot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_INGOT, slots.toList(), block)

fun BaseMenuBuilder.netheriteLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.netheritePickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.netheriteScrap(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_SCRAP, slots.toList(), block)

fun BaseMenuBuilder.netheriteShovel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_SHOVEL, slots.toList(), block)

fun BaseMenuBuilder.netheriteSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_SWORD, slots.toList(), block)

fun BaseMenuBuilder.netheriteUpgradeSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.oakBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_BOAT, slots.toList(), block)

fun BaseMenuBuilder.oakChestBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_CHEST_BOAT, slots.toList(), block)

fun BaseMenuBuilder.ocelotSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OCELOT_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.ominousBottle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OMINOUS_BOTTLE, slots.toList(), block)

fun BaseMenuBuilder.ominousTrialKey(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OMINOUS_TRIAL_KEY, slots.toList(), block)

fun BaseMenuBuilder.orangeBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.orangeDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_DYE, slots.toList(), block)

fun BaseMenuBuilder.orangeHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.painting(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PAINTING, slots.toList(), block)

fun BaseMenuBuilder.paleOakBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_BOAT, slots.toList(), block)

fun BaseMenuBuilder.paleOakChestBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_CHEST_BOAT, slots.toList(), block)

fun BaseMenuBuilder.pandaSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PANDA_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.paper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PAPER, slots.toList(), block)

fun BaseMenuBuilder.parrotSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PARROT_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.phantomMembrane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PHANTOM_MEMBRANE, slots.toList(), block)

fun BaseMenuBuilder.phantomSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PHANTOM_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.pigSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PIG_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.piglinBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PIGLIN_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.piglinBruteSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PIGLIN_BRUTE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.piglinSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PIGLIN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.pillagerSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PILLAGER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.pinkBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.pinkDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_DYE, slots.toList(), block)

fun BaseMenuBuilder.pinkHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.pitcherPod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PITCHER_POD, slots.toList(), block)

fun BaseMenuBuilder.plentyPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PLENTY_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.poisonousPotato(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POISONOUS_POTATO, slots.toList(), block)

fun BaseMenuBuilder.polarBearSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLAR_BEAR_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.poppedChorusFruit(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POPPED_CHORUS_FRUIT, slots.toList(), block)

fun BaseMenuBuilder.porkchop(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PORKCHOP, slots.toList(), block)

fun BaseMenuBuilder.potato(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTATO, slots.toList(), block)

fun BaseMenuBuilder.potion(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTION, slots.toList(), block)

fun BaseMenuBuilder.powderSnowBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POWDER_SNOW_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.prismarineCrystals(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRISMARINE_CRYSTALS, slots.toList(), block)

fun BaseMenuBuilder.prismarineShard(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRISMARINE_SHARD, slots.toList(), block)

fun BaseMenuBuilder.prizePotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRIZE_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.pufferfish(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PUFFERFISH, slots.toList(), block)

fun BaseMenuBuilder.pufferfishBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PUFFERFISH_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.pufferfishSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PUFFERFISH_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.pumpkinPie(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PUMPKIN_PIE, slots.toList(), block)

fun BaseMenuBuilder.pumpkinSeeds(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PUMPKIN_SEEDS, slots.toList(), block)

fun BaseMenuBuilder.purpleBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.purpleDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_DYE, slots.toList(), block)

fun BaseMenuBuilder.purpleHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.quartz(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.QUARTZ, slots.toList(), block)

fun BaseMenuBuilder.rabbit(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RABBIT, slots.toList(), block)

fun BaseMenuBuilder.rabbitFoot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RABBIT_FOOT, slots.toList(), block)

fun BaseMenuBuilder.rabbitHide(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RABBIT_HIDE, slots.toList(), block)

fun BaseMenuBuilder.rabbitSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RABBIT_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.rabbitStew(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RABBIT_STEW, slots.toList(), block)

fun BaseMenuBuilder.raiserArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.ravagerSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RAVAGER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.rawCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RAW_COPPER, slots.toList(), block)

fun BaseMenuBuilder.rawGold(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RAW_GOLD, slots.toList(), block)

fun BaseMenuBuilder.rawIron(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RAW_IRON, slots.toList(), block)

fun BaseMenuBuilder.recoveryCompass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RECOVERY_COMPASS, slots.toList(), block)

fun BaseMenuBuilder.redBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.redDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_DYE, slots.toList(), block)

fun BaseMenuBuilder.redHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.redstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REDSTONE, slots.toList(), block)

fun BaseMenuBuilder.resinBrick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RESIN_BRICK, slots.toList(), block)

fun BaseMenuBuilder.ribArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.rottenFlesh(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ROTTEN_FLESH, slots.toList(), block)

fun BaseMenuBuilder.saddle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SADDLE, slots.toList(), block)

fun BaseMenuBuilder.salmon(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SALMON, slots.toList(), block)

fun BaseMenuBuilder.salmonBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SALMON_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.salmonSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SALMON_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.scrapePotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SCRAPE_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.sentryArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.shaperArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.sheafPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHEAF_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.shears(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHEARS, slots.toList(), block)

fun BaseMenuBuilder.sheepSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHEEP_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.shelterPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHELTER_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.shield(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHIELD, slots.toList(), block)

fun BaseMenuBuilder.shulkerShell(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHULKER_SHELL, slots.toList(), block)

fun BaseMenuBuilder.shulkerSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHULKER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.silenceArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.silverfishSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SILVERFISH_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.skeletonHorseSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SKELETON_HORSE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.skeletonSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SKELETON_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.skullBannerPattern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SKULL_BANNER_PATTERN, slots.toList(), block)

fun BaseMenuBuilder.skullPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SKULL_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.slimeBall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SLIME_BALL, slots.toList(), block)

fun BaseMenuBuilder.slimeSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SLIME_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.snifferSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SNIFFER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.snortPotterySherd(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SNORT_POTTERY_SHERD, slots.toList(), block)

fun BaseMenuBuilder.snoutArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.snowGolemSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SNOW_GOLEM_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.snowball(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SNOWBALL, slots.toList(), block)

fun BaseMenuBuilder.spectralArrow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPECTRAL_ARROW, slots.toList(), block)

fun BaseMenuBuilder.spiderEye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPIDER_EYE, slots.toList(), block)

fun BaseMenuBuilder.spiderSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPIDER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.spireArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.splashPotion(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPLASH_POTION, slots.toList(), block)

fun BaseMenuBuilder.spruceBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_BOAT, slots.toList(), block)

fun BaseMenuBuilder.spruceChestBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_CHEST_BOAT, slots.toList(), block)

fun BaseMenuBuilder.spyglass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPYGLASS, slots.toList(), block)

fun BaseMenuBuilder.squidSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SQUID_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.stick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STICK, slots.toList(), block)

fun BaseMenuBuilder.stoneAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_AXE, slots.toList(), block)

fun BaseMenuBuilder.stoneHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_HOE, slots.toList(), block)

fun BaseMenuBuilder.stonePickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.stoneShovel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_SHOVEL, slots.toList(), block)

fun BaseMenuBuilder.stoneSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_SWORD, slots.toList(), block)

fun BaseMenuBuilder.straySpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRAY_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.striderSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIDER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.string(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRING, slots.toList(), block)

fun BaseMenuBuilder.sugar(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SUGAR, slots.toList(), block)

fun BaseMenuBuilder.suspiciousStew(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SUSPICIOUS_STEW, slots.toList(), block)

fun BaseMenuBuilder.sweetBerries(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SWEET_BERRIES, slots.toList(), block)

fun BaseMenuBuilder.tadpoleBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TADPOLE_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.tadpoleSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TADPOLE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.tideArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.tippedArrow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TIPPED_ARROW, slots.toList(), block)

fun BaseMenuBuilder.tntMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TNT_MINECART, slots.toList(), block)

fun BaseMenuBuilder.torchflowerSeeds(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TORCHFLOWER_SEEDS, slots.toList(), block)

fun BaseMenuBuilder.totemOfUndying(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TOTEM_OF_UNDYING, slots.toList(), block)

fun BaseMenuBuilder.traderLlamaSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TRADER_LLAMA_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.trialKey(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TRIAL_KEY, slots.toList(), block)

fun BaseMenuBuilder.trident(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TRIDENT, slots.toList(), block)

fun BaseMenuBuilder.tropicalFish(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TROPICAL_FISH, slots.toList(), block)

fun BaseMenuBuilder.tropicalFishBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TROPICAL_FISH_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.tropicalFishSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TROPICAL_FISH_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.turtleHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TURTLE_HELMET, slots.toList(), block)

fun BaseMenuBuilder.turtleScute(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TURTLE_SCUTE, slots.toList(), block)

fun BaseMenuBuilder.turtleSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TURTLE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.vexArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.vexSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.VEX_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.villagerSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.VILLAGER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.vindicatorSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.VINDICATOR_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.wanderingTraderSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WANDERING_TRADER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.wardArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.wardenSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARDEN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.warpedFungusOnAStick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_FUNGUS_ON_A_STICK, slots.toList(), block)

fun BaseMenuBuilder.waterBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WATER_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.wayfinderArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.wheatSeeds(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHEAT_SEEDS, slots.toList(), block)

fun BaseMenuBuilder.whiteBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.whiteDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_DYE, slots.toList(), block)

fun BaseMenuBuilder.whiteHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.wildArmorTrimSmithingTemplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE, slots.toList(), block)

fun BaseMenuBuilder.windCharge(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WIND_CHARGE, slots.toList(), block)

fun BaseMenuBuilder.witchSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WITCH_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.witherSkeletonSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WITHER_SKELETON_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.witherSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WITHER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.wolfArmor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WOLF_ARMOR, slots.toList(), block)

fun BaseMenuBuilder.wolfSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WOLF_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.woodenAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WOODEN_AXE, slots.toList(), block)

fun BaseMenuBuilder.woodenHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WOODEN_HOE, slots.toList(), block)

fun BaseMenuBuilder.woodenPickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WOODEN_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.woodenShovel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WOODEN_SHOVEL, slots.toList(), block)

fun BaseMenuBuilder.woodenSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WOODEN_SWORD, slots.toList(), block)

fun BaseMenuBuilder.writableBook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WRITABLE_BOOK, slots.toList(), block)

fun BaseMenuBuilder.writtenBook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WRITTEN_BOOK, slots.toList(), block)

fun BaseMenuBuilder.yellowBundle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_BUNDLE, slots.toList(), block)

fun BaseMenuBuilder.yellowDye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_DYE, slots.toList(), block)

fun BaseMenuBuilder.yellowHarness(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_HARNESS, slots.toList(), block)

fun BaseMenuBuilder.zoglinSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ZOGLIN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.zombieHorseSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ZOMBIE_HORSE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.zombieSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ZOMBIE_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.zombieVillagerSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ZOMBIE_VILLAGER_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.zombifiedPiglinSpawnEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG, slots.toList(), block)

fun BaseMenuBuilder.acaciaButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.acaciaDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_DOOR, slots.toList(), block)

fun BaseMenuBuilder.acaciaFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_FENCE, slots.toList(), block)

fun BaseMenuBuilder.acaciaFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.acaciaHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.acaciaLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.acaciaLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_LOG, slots.toList(), block)

fun BaseMenuBuilder.acaciaPlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.acaciaPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.acaciaSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.acaciaSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_SIGN, slots.toList(), block)

fun BaseMenuBuilder.acaciaSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_SLAB, slots.toList(), block)

fun BaseMenuBuilder.acaciaStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.acaciaTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.acaciaWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.acaciaWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.acaciaWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACACIA_WOOD, slots.toList(), block)

fun BaseMenuBuilder.activatorRail(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ACTIVATOR_RAIL, slots.toList(), block)

fun BaseMenuBuilder.allium(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ALLIUM, slots.toList(), block)

fun BaseMenuBuilder.amethystBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.AMETHYST_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.amethystCluster(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.AMETHYST_CLUSTER, slots.toList(), block)

fun BaseMenuBuilder.ancientDebris(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ANCIENT_DEBRIS, slots.toList(), block)

fun BaseMenuBuilder.andesite(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ANDESITE, slots.toList(), block)

fun BaseMenuBuilder.andesiteSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ANDESITE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.andesiteStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ANDESITE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.andesiteWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ANDESITE_WALL, slots.toList(), block)

fun BaseMenuBuilder.anvil(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ANVIL, slots.toList(), block)

fun BaseMenuBuilder.attachedMelonStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ATTACHED_MELON_STEM, slots.toList(), block)

fun BaseMenuBuilder.attachedPumpkinStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ATTACHED_PUMPKIN_STEM, slots.toList(), block)

fun BaseMenuBuilder.azalea(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.AZALEA, slots.toList(), block)

fun BaseMenuBuilder.azaleaLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.AZALEA_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.azureBluet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.AZURE_BLUET, slots.toList(), block)

fun BaseMenuBuilder.bamboo(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO, slots.toList(), block)

fun BaseMenuBuilder.bambooBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.bambooButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.bambooDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_DOOR, slots.toList(), block)

fun BaseMenuBuilder.bambooFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_FENCE, slots.toList(), block)

fun BaseMenuBuilder.bambooFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.bambooHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.bambooMosaic(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_MOSAIC, slots.toList(), block)

fun BaseMenuBuilder.bambooMosaicSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_MOSAIC_SLAB, slots.toList(), block)

fun BaseMenuBuilder.bambooMosaicStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_MOSAIC_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.bambooPlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.bambooPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.bambooSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.bambooSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_SIGN, slots.toList(), block)

fun BaseMenuBuilder.bambooSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_SLAB, slots.toList(), block)

fun BaseMenuBuilder.bambooStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.bambooTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.bambooWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.bambooWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BAMBOO_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.barrel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BARREL, slots.toList(), block)

fun BaseMenuBuilder.barrier(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BARRIER, slots.toList(), block)

fun BaseMenuBuilder.basalt(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BASALT, slots.toList(), block)

fun BaseMenuBuilder.beacon(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEACON, slots.toList(), block)

fun BaseMenuBuilder.bedrock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEDROCK, slots.toList(), block)

fun BaseMenuBuilder.beeNest(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEE_NEST, slots.toList(), block)

fun BaseMenuBuilder.beehive(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEEHIVE, slots.toList(), block)

fun BaseMenuBuilder.beetroots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BEETROOTS, slots.toList(), block)

fun BaseMenuBuilder.bell(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BELL, slots.toList(), block)

fun BaseMenuBuilder.bigDripleaf(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIG_DRIPLEAF, slots.toList(), block)

fun BaseMenuBuilder.bigDripleafStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIG_DRIPLEAF_STEM, slots.toList(), block)

fun BaseMenuBuilder.birchButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.birchDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_DOOR, slots.toList(), block)

fun BaseMenuBuilder.birchFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_FENCE, slots.toList(), block)

fun BaseMenuBuilder.birchFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.birchHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.birchLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.birchLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_LOG, slots.toList(), block)

fun BaseMenuBuilder.birchPlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.birchPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.birchSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.birchSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_SIGN, slots.toList(), block)

fun BaseMenuBuilder.birchSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_SLAB, slots.toList(), block)

fun BaseMenuBuilder.birchStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.birchTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.birchWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.birchWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.birchWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BIRCH_WOOD, slots.toList(), block)

fun BaseMenuBuilder.blackBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_BANNER, slots.toList(), block)

fun BaseMenuBuilder.blackBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_BED, slots.toList(), block)

fun BaseMenuBuilder.blackCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.blackCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.blackCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_CARPET, slots.toList(), block)

fun BaseMenuBuilder.blackConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.blackConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.blackGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.blackShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.blackStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.blackStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.blackTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.blackWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.blackWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACK_WOOL, slots.toList(), block)

fun BaseMenuBuilder.blackstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACKSTONE, slots.toList(), block)

fun BaseMenuBuilder.blackstoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACKSTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.blackstoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACKSTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.blackstoneWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLACKSTONE_WALL, slots.toList(), block)

fun BaseMenuBuilder.blastFurnace(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLAST_FURNACE, slots.toList(), block)

fun BaseMenuBuilder.blueBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_BANNER, slots.toList(), block)

fun BaseMenuBuilder.blueBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_BED, slots.toList(), block)

fun BaseMenuBuilder.blueCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.blueCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.blueCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_CARPET, slots.toList(), block)

fun BaseMenuBuilder.blueConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.blueConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.blueGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.blueIce(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_ICE, slots.toList(), block)

fun BaseMenuBuilder.blueOrchid(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_ORCHID, slots.toList(), block)

fun BaseMenuBuilder.blueShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.blueStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.blueStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.blueTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.blueWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.blueWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BLUE_WOOL, slots.toList(), block)

fun BaseMenuBuilder.boneBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BONE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.bookshelf(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BOOKSHELF, slots.toList(), block)

fun BaseMenuBuilder.brainCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRAIN_CORAL, slots.toList(), block)

fun BaseMenuBuilder.brainCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRAIN_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.brainCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRAIN_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.brainCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRAIN_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.brewingStand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BREWING_STAND, slots.toList(), block)

fun BaseMenuBuilder.brickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.brickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.brickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.bricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BRICKS, slots.toList(), block)

fun BaseMenuBuilder.brownBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_BANNER, slots.toList(), block)

fun BaseMenuBuilder.brownBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_BED, slots.toList(), block)

fun BaseMenuBuilder.brownCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.brownCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.brownCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_CARPET, slots.toList(), block)

fun BaseMenuBuilder.brownConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.brownConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.brownGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.brownMushroom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_MUSHROOM, slots.toList(), block)

fun BaseMenuBuilder.brownMushroomBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_MUSHROOM_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.brownShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.brownStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.brownStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.brownTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.brownWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.brownWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BROWN_WOOL, slots.toList(), block)

fun BaseMenuBuilder.bubbleColumn(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BUBBLE_COLUMN, slots.toList(), block)

fun BaseMenuBuilder.bubbleCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BUBBLE_CORAL, slots.toList(), block)

fun BaseMenuBuilder.bubbleCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BUBBLE_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.bubbleCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BUBBLE_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.bubbleCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BUBBLE_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.buddingAmethyst(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BUDDING_AMETHYST, slots.toList(), block)

fun BaseMenuBuilder.bush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.BUSH, slots.toList(), block)

fun BaseMenuBuilder.cactus(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CACTUS, slots.toList(), block)

fun BaseMenuBuilder.cactusFlower(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CACTUS_FLOWER, slots.toList(), block)

fun BaseMenuBuilder.cake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CAKE, slots.toList(), block)

fun BaseMenuBuilder.calcite(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CALCITE, slots.toList(), block)

fun BaseMenuBuilder.calibratedSculkSensor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CALIBRATED_SCULK_SENSOR, slots.toList(), block)

fun BaseMenuBuilder.campfire(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CAMPFIRE, slots.toList(), block)

fun BaseMenuBuilder.candle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CANDLE, slots.toList(), block)

fun BaseMenuBuilder.candleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.carrots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CARROTS, slots.toList(), block)

fun BaseMenuBuilder.cartographyTable(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CARTOGRAPHY_TABLE, slots.toList(), block)

fun BaseMenuBuilder.carvedPumpkin(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CARVED_PUMPKIN, slots.toList(), block)

fun BaseMenuBuilder.cauldron(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CAULDRON, slots.toList(), block)

fun BaseMenuBuilder.caveAir(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CAVE_AIR, slots.toList(), block)

fun BaseMenuBuilder.caveVines(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CAVE_VINES, slots.toList(), block)

fun BaseMenuBuilder.caveVinesPlant(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CAVE_VINES_PLANT, slots.toList(), block)

fun BaseMenuBuilder.chain(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHAIN, slots.toList(), block)

fun BaseMenuBuilder.chainCommandBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHAIN_COMMAND_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.cherryButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.cherryDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_DOOR, slots.toList(), block)

fun BaseMenuBuilder.cherryFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_FENCE, slots.toList(), block)

fun BaseMenuBuilder.cherryFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.cherryHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.cherryLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.cherryLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_LOG, slots.toList(), block)

fun BaseMenuBuilder.cherryPlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.cherryPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.cherrySapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.cherrySign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_SIGN, slots.toList(), block)

fun BaseMenuBuilder.cherrySlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_SLAB, slots.toList(), block)

fun BaseMenuBuilder.cherryStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.cherryTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.cherryWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.cherryWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.cherryWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHERRY_WOOD, slots.toList(), block)

fun BaseMenuBuilder.chest(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHEST, slots.toList(), block)

fun BaseMenuBuilder.chippedAnvil(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHIPPED_ANVIL, slots.toList(), block)

fun BaseMenuBuilder.chiseledBookshelf(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_BOOKSHELF, slots.toList(), block)

fun BaseMenuBuilder.chiseledCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.chiseledDeepslate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_DEEPSLATE, slots.toList(), block)

fun BaseMenuBuilder.chiseledNetherBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_NETHER_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.chiseledPolishedBlackstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_POLISHED_BLACKSTONE, slots.toList(), block)

fun BaseMenuBuilder.chiseledQuartzBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_QUARTZ_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.chiseledRedSandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_RED_SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.chiseledResinBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_RESIN_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.chiseledSandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.chiseledStoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_STONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.chiseledTuff(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_TUFF, slots.toList(), block)

fun BaseMenuBuilder.chiseledTuffBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHISELED_TUFF_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.chorusFlower(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHORUS_FLOWER, slots.toList(), block)

fun BaseMenuBuilder.chorusPlant(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CHORUS_PLANT, slots.toList(), block)

fun BaseMenuBuilder.clay(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CLAY, slots.toList(), block)

fun BaseMenuBuilder.closedEyeblossom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CLOSED_EYEBLOSSOM, slots.toList(), block)

fun BaseMenuBuilder.coalBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.coalOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COAL_ORE, slots.toList(), block)

fun BaseMenuBuilder.coarseDirt(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COARSE_DIRT, slots.toList(), block)

fun BaseMenuBuilder.cobbledDeepslate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COBBLED_DEEPSLATE, slots.toList(), block)

fun BaseMenuBuilder.cobbledDeepslateSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COBBLED_DEEPSLATE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.cobbledDeepslateStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COBBLED_DEEPSLATE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.cobbledDeepslateWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COBBLED_DEEPSLATE_WALL, slots.toList(), block)

fun BaseMenuBuilder.cobblestone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COBBLESTONE, slots.toList(), block)

fun BaseMenuBuilder.cobblestoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COBBLESTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.cobblestoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COBBLESTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.cobblestoneWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COBBLESTONE_WALL, slots.toList(), block)

fun BaseMenuBuilder.cobweb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COBWEB, slots.toList(), block)

fun BaseMenuBuilder.cocoa(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COCOA, slots.toList(), block)

fun BaseMenuBuilder.commandBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COMMAND_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.comparator(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COMPARATOR, slots.toList(), block)

fun BaseMenuBuilder.composter(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COMPOSTER, slots.toList(), block)

fun BaseMenuBuilder.conduit(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CONDUIT, slots.toList(), block)

fun BaseMenuBuilder.copperBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COPPER_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.copperBulb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COPPER_BULB, slots.toList(), block)

fun BaseMenuBuilder.copperDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COPPER_DOOR, slots.toList(), block)

fun BaseMenuBuilder.copperGrate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COPPER_GRATE, slots.toList(), block)

fun BaseMenuBuilder.copperOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COPPER_ORE, slots.toList(), block)

fun BaseMenuBuilder.copperTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.COPPER_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.cornflower(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CORNFLOWER, slots.toList(), block)

fun BaseMenuBuilder.crackedDeepslateBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRACKED_DEEPSLATE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.crackedDeepslateTiles(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRACKED_DEEPSLATE_TILES, slots.toList(), block)

fun BaseMenuBuilder.crackedNetherBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRACKED_NETHER_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.crackedPolishedBlackstoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.crackedStoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRACKED_STONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.crafter(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRAFTER, slots.toList(), block)

fun BaseMenuBuilder.craftingTable(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRAFTING_TABLE, slots.toList(), block)

fun BaseMenuBuilder.creakingHeart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CREAKING_HEART, slots.toList(), block)

fun BaseMenuBuilder.creeperHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CREEPER_HEAD, slots.toList(), block)

fun BaseMenuBuilder.creeperWallHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CREEPER_WALL_HEAD, slots.toList(), block)

fun BaseMenuBuilder.crimsonButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.crimsonDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_DOOR, slots.toList(), block)

fun BaseMenuBuilder.crimsonFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_FENCE, slots.toList(), block)

fun BaseMenuBuilder.crimsonFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.crimsonFungus(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_FUNGUS, slots.toList(), block)

fun BaseMenuBuilder.crimsonHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.crimsonHyphae(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_HYPHAE, slots.toList(), block)

fun BaseMenuBuilder.crimsonNylium(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_NYLIUM, slots.toList(), block)

fun BaseMenuBuilder.crimsonPlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.crimsonPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.crimsonRoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_ROOTS, slots.toList(), block)

fun BaseMenuBuilder.crimsonSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_SIGN, slots.toList(), block)

fun BaseMenuBuilder.crimsonSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_SLAB, slots.toList(), block)

fun BaseMenuBuilder.crimsonStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.crimsonStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_STEM, slots.toList(), block)

fun BaseMenuBuilder.crimsonTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.crimsonWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.crimsonWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRIMSON_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.cryingObsidian(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CRYING_OBSIDIAN, slots.toList(), block)

fun BaseMenuBuilder.cutCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CUT_COPPER, slots.toList(), block)

fun BaseMenuBuilder.cutCopperSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CUT_COPPER_SLAB, slots.toList(), block)

fun BaseMenuBuilder.cutCopperStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CUT_COPPER_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.cutRedSandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CUT_RED_SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.cutRedSandstoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CUT_RED_SANDSTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.cutSandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CUT_SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.cutSandstoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CUT_SANDSTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.cyanBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_BANNER, slots.toList(), block)

fun BaseMenuBuilder.cyanBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_BED, slots.toList(), block)

fun BaseMenuBuilder.cyanCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.cyanCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.cyanCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_CARPET, slots.toList(), block)

fun BaseMenuBuilder.cyanConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.cyanConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.cyanGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.cyanShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.cyanStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.cyanStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.cyanTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.cyanWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.cyanWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.CYAN_WOOL, slots.toList(), block)

fun BaseMenuBuilder.damagedAnvil(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DAMAGED_ANVIL, slots.toList(), block)

fun BaseMenuBuilder.dandelion(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DANDELION, slots.toList(), block)

fun BaseMenuBuilder.darkOakButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.darkOakDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_DOOR, slots.toList(), block)

fun BaseMenuBuilder.darkOakFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_FENCE, slots.toList(), block)

fun BaseMenuBuilder.darkOakFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.darkOakHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.darkOakLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.darkOakLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_LOG, slots.toList(), block)

fun BaseMenuBuilder.darkOakPlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.darkOakPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.darkOakSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.darkOakSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_SIGN, slots.toList(), block)

fun BaseMenuBuilder.darkOakSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.darkOakStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.darkOakTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.darkOakWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.darkOakWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.darkOakWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_OAK_WOOD, slots.toList(), block)

fun BaseMenuBuilder.darkPrismarine(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_PRISMARINE, slots.toList(), block)

fun BaseMenuBuilder.darkPrismarineSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_PRISMARINE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.darkPrismarineStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DARK_PRISMARINE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.daylightDetector(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DAYLIGHT_DETECTOR, slots.toList(), block)

fun BaseMenuBuilder.deadBrainCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_BRAIN_CORAL, slots.toList(), block)

fun BaseMenuBuilder.deadBrainCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_BRAIN_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.deadBrainCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_BRAIN_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.deadBrainCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_BRAIN_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.deadBubbleCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_BUBBLE_CORAL, slots.toList(), block)

fun BaseMenuBuilder.deadBubbleCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_BUBBLE_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.deadBubbleCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_BUBBLE_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.deadBubbleCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_BUBBLE_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.deadBush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_BUSH, slots.toList(), block)

fun BaseMenuBuilder.deadFireCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_FIRE_CORAL, slots.toList(), block)

fun BaseMenuBuilder.deadFireCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_FIRE_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.deadFireCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_FIRE_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.deadFireCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_FIRE_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.deadHornCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_HORN_CORAL, slots.toList(), block)

fun BaseMenuBuilder.deadHornCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_HORN_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.deadHornCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_HORN_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.deadHornCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_HORN_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.deadTubeCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_TUBE_CORAL, slots.toList(), block)

fun BaseMenuBuilder.deadTubeCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_TUBE_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.deadTubeCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_TUBE_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.deadTubeCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEAD_TUBE_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.decoratedPot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DECORATED_POT, slots.toList(), block)

fun BaseMenuBuilder.deepslate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE, slots.toList(), block)

fun BaseMenuBuilder.deepslateBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.deepslateBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.deepslateBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.deepslateBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.deepslateCoalOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_COAL_ORE, slots.toList(), block)

fun BaseMenuBuilder.deepslateCopperOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_COPPER_ORE, slots.toList(), block)

fun BaseMenuBuilder.deepslateDiamondOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_DIAMOND_ORE, slots.toList(), block)

fun BaseMenuBuilder.deepslateEmeraldOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_EMERALD_ORE, slots.toList(), block)

fun BaseMenuBuilder.deepslateGoldOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_GOLD_ORE, slots.toList(), block)

fun BaseMenuBuilder.deepslateIronOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_IRON_ORE, slots.toList(), block)

fun BaseMenuBuilder.deepslateLapisOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_LAPIS_ORE, slots.toList(), block)

fun BaseMenuBuilder.deepslateRedstoneOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_REDSTONE_ORE, slots.toList(), block)

fun BaseMenuBuilder.deepslateTileSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_TILE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.deepslateTileStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_TILE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.deepslateTileWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_TILE_WALL, slots.toList(), block)

fun BaseMenuBuilder.deepslateTiles(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DEEPSLATE_TILES, slots.toList(), block)

fun BaseMenuBuilder.detectorRail(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DETECTOR_RAIL, slots.toList(), block)

fun BaseMenuBuilder.diamondBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.diamondOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIAMOND_ORE, slots.toList(), block)

fun BaseMenuBuilder.diorite(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIORITE, slots.toList(), block)

fun BaseMenuBuilder.dioriteSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIORITE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.dioriteStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIORITE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.dioriteWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIORITE_WALL, slots.toList(), block)

fun BaseMenuBuilder.dirt(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIRT, slots.toList(), block)

fun BaseMenuBuilder.dirtPath(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DIRT_PATH, slots.toList(), block)

fun BaseMenuBuilder.dispenser(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DISPENSER, slots.toList(), block)

fun BaseMenuBuilder.dragonEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DRAGON_EGG, slots.toList(), block)

fun BaseMenuBuilder.dragonHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DRAGON_HEAD, slots.toList(), block)

fun BaseMenuBuilder.dragonWallHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DRAGON_WALL_HEAD, slots.toList(), block)

fun BaseMenuBuilder.driedGhast(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DRIED_GHAST, slots.toList(), block)

fun BaseMenuBuilder.driedKelpBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DRIED_KELP_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.dripstoneBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DRIPSTONE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.dropper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.DROPPER, slots.toList(), block)

fun BaseMenuBuilder.emeraldBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EMERALD_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.emeraldOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EMERALD_ORE, slots.toList(), block)

fun BaseMenuBuilder.enchantingTable(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ENCHANTING_TABLE, slots.toList(), block)

fun BaseMenuBuilder.endGateway(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_GATEWAY, slots.toList(), block)

fun BaseMenuBuilder.endPortal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_PORTAL, slots.toList(), block)

fun BaseMenuBuilder.endPortalFrame(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_PORTAL_FRAME, slots.toList(), block)

fun BaseMenuBuilder.endRod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_ROD, slots.toList(), block)

fun BaseMenuBuilder.endStone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_STONE, slots.toList(), block)

fun BaseMenuBuilder.endStoneBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_STONE_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.endStoneBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_STONE_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.endStoneBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_STONE_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.endStoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.END_STONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.enderChest(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ENDER_CHEST, slots.toList(), block)

fun BaseMenuBuilder.exposedChiseledCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPOSED_CHISELED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.exposedCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPOSED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.exposedCopperBulb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPOSED_COPPER_BULB, slots.toList(), block)

fun BaseMenuBuilder.exposedCopperDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPOSED_COPPER_DOOR, slots.toList(), block)

fun BaseMenuBuilder.exposedCopperGrate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPOSED_COPPER_GRATE, slots.toList(), block)

fun BaseMenuBuilder.exposedCopperTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPOSED_COPPER_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.exposedCutCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPOSED_CUT_COPPER, slots.toList(), block)

fun BaseMenuBuilder.exposedCutCopperSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPOSED_CUT_COPPER_SLAB, slots.toList(), block)

fun BaseMenuBuilder.exposedCutCopperStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.EXPOSED_CUT_COPPER_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.farmland(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FARMLAND, slots.toList(), block)

fun BaseMenuBuilder.fern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FERN, slots.toList(), block)

fun BaseMenuBuilder.fire(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIRE, slots.toList(), block)

fun BaseMenuBuilder.fireCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIRE_CORAL, slots.toList(), block)

fun BaseMenuBuilder.fireCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIRE_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.fireCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIRE_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.fireCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIRE_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.fireflyBush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FIREFLY_BUSH, slots.toList(), block)

fun BaseMenuBuilder.fletchingTable(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLETCHING_TABLE, slots.toList(), block)

fun BaseMenuBuilder.flowerPot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLOWER_POT, slots.toList(), block)

fun BaseMenuBuilder.floweringAzalea(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLOWERING_AZALEA, slots.toList(), block)

fun BaseMenuBuilder.floweringAzaleaLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FLOWERING_AZALEA_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.frogspawn(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FROGSPAWN, slots.toList(), block)

fun BaseMenuBuilder.frostedIce(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FROSTED_ICE, slots.toList(), block)

fun BaseMenuBuilder.furnace(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.FURNACE, slots.toList(), block)

fun BaseMenuBuilder.gildedBlackstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GILDED_BLACKSTONE, slots.toList(), block)

fun BaseMenuBuilder.glass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLASS, slots.toList(), block)

fun BaseMenuBuilder.glassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.glowLichen(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLOW_LICHEN, slots.toList(), block)

fun BaseMenuBuilder.glowstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GLOWSTONE, slots.toList(), block)

fun BaseMenuBuilder.goldBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLD_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.goldOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GOLD_ORE, slots.toList(), block)

fun BaseMenuBuilder.granite(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRANITE, slots.toList(), block)

fun BaseMenuBuilder.graniteSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRANITE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.graniteStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRANITE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.graniteWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRANITE_WALL, slots.toList(), block)

fun BaseMenuBuilder.grassBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRASS_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.gravel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAVEL, slots.toList(), block)

fun BaseMenuBuilder.grayBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_BANNER, slots.toList(), block)

fun BaseMenuBuilder.grayBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_BED, slots.toList(), block)

fun BaseMenuBuilder.grayCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.grayCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.grayCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_CARPET, slots.toList(), block)

fun BaseMenuBuilder.grayConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.grayConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.grayGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.grayShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.grayStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.grayStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.grayTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.grayWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.grayWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRAY_WOOL, slots.toList(), block)

fun BaseMenuBuilder.greenBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_BANNER, slots.toList(), block)

fun BaseMenuBuilder.greenBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_BED, slots.toList(), block)

fun BaseMenuBuilder.greenCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.greenCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.greenCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_CARPET, slots.toList(), block)

fun BaseMenuBuilder.greenConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.greenConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.greenGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.greenShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.greenStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.greenStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.greenTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.greenWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.greenWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GREEN_WOOL, slots.toList(), block)

fun BaseMenuBuilder.grindstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.GRINDSTONE, slots.toList(), block)

fun BaseMenuBuilder.hangingRoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HANGING_ROOTS, slots.toList(), block)

fun BaseMenuBuilder.hayBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HAY_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.heavyCore(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HEAVY_CORE, slots.toList(), block)

fun BaseMenuBuilder.heavyWeightedPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HEAVY_WEIGHTED_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.honeyBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HONEY_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.honeycombBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HONEYCOMB_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.hopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HOPPER, slots.toList(), block)

fun BaseMenuBuilder.hornCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HORN_CORAL, slots.toList(), block)

fun BaseMenuBuilder.hornCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HORN_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.hornCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HORN_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.hornCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.HORN_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.ice(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ICE, slots.toList(), block)

fun BaseMenuBuilder.infestedChiseledStoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.INFESTED_CHISELED_STONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.infestedCobblestone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.INFESTED_COBBLESTONE, slots.toList(), block)

fun BaseMenuBuilder.infestedCrackedStoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.INFESTED_CRACKED_STONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.infestedDeepslate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.INFESTED_DEEPSLATE, slots.toList(), block)

fun BaseMenuBuilder.infestedMossyStoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.INFESTED_MOSSY_STONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.infestedStone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.INFESTED_STONE, slots.toList(), block)

fun BaseMenuBuilder.infestedStoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.INFESTED_STONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.ironBars(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_BARS, slots.toList(), block)

fun BaseMenuBuilder.ironBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.ironDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_DOOR, slots.toList(), block)

fun BaseMenuBuilder.ironOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_ORE, slots.toList(), block)

fun BaseMenuBuilder.ironTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.IRON_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.jackOLantern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JACK_O_LANTERN, slots.toList(), block)

fun BaseMenuBuilder.jigsaw(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JIGSAW, slots.toList(), block)

fun BaseMenuBuilder.jukebox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUKEBOX, slots.toList(), block)

fun BaseMenuBuilder.jungleButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.jungleDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_DOOR, slots.toList(), block)

fun BaseMenuBuilder.jungleFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_FENCE, slots.toList(), block)

fun BaseMenuBuilder.jungleFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.jungleHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.jungleLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.jungleLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_LOG, slots.toList(), block)

fun BaseMenuBuilder.junglePlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.junglePressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.jungleSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.jungleSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_SIGN, slots.toList(), block)

fun BaseMenuBuilder.jungleSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.jungleStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.jungleTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.jungleWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.jungleWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.jungleWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.JUNGLE_WOOD, slots.toList(), block)

fun BaseMenuBuilder.kelp(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.KELP, slots.toList(), block)

fun BaseMenuBuilder.kelpPlant(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.KELP_PLANT, slots.toList(), block)

fun BaseMenuBuilder.ladder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LADDER, slots.toList(), block)

fun BaseMenuBuilder.lantern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LANTERN, slots.toList(), block)

fun BaseMenuBuilder.lapisBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LAPIS_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.lapisOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LAPIS_ORE, slots.toList(), block)

fun BaseMenuBuilder.largeAmethystBud(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LARGE_AMETHYST_BUD, slots.toList(), block)

fun BaseMenuBuilder.largeFern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LARGE_FERN, slots.toList(), block)

fun BaseMenuBuilder.lava(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LAVA, slots.toList(), block)

fun BaseMenuBuilder.lavaCauldron(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LAVA_CAULDRON, slots.toList(), block)

fun BaseMenuBuilder.leafLitter(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEAF_LITTER, slots.toList(), block)

fun BaseMenuBuilder.lectern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LECTERN, slots.toList(), block)

fun BaseMenuBuilder.lever(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEVER, slots.toList(), block)

fun BaseMenuBuilder.light(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT, slots.toList(), block)

fun BaseMenuBuilder.lightBlueBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_BANNER, slots.toList(), block)

fun BaseMenuBuilder.lightBlueBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_BED, slots.toList(), block)

fun BaseMenuBuilder.lightBlueCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.lightBlueCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.lightBlueCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_CARPET, slots.toList(), block)

fun BaseMenuBuilder.lightBlueConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.lightBlueConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.lightBlueGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.lightBlueShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.lightBlueStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.lightBlueStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.lightBlueTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.lightBlueWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.lightBlueWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_BLUE_WOOL, slots.toList(), block)

fun BaseMenuBuilder.lightGrayBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_BANNER, slots.toList(), block)

fun BaseMenuBuilder.lightGrayBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_BED, slots.toList(), block)

fun BaseMenuBuilder.lightGrayCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.lightGrayCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.lightGrayCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_CARPET, slots.toList(), block)

fun BaseMenuBuilder.lightGrayConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.lightGrayConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.lightGrayGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.lightGrayShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.lightGrayStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.lightGrayStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.lightGrayTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.lightGrayWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.lightGrayWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_GRAY_WOOL, slots.toList(), block)

fun BaseMenuBuilder.lightWeightedPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHT_WEIGHTED_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.lightningRod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIGHTNING_ROD, slots.toList(), block)

fun BaseMenuBuilder.lilac(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LILAC, slots.toList(), block)

fun BaseMenuBuilder.lilyOfTheValley(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LILY_OF_THE_VALLEY, slots.toList(), block)

fun BaseMenuBuilder.lilyPad(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LILY_PAD, slots.toList(), block)

fun BaseMenuBuilder.limeBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_BANNER, slots.toList(), block)

fun BaseMenuBuilder.limeBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_BED, slots.toList(), block)

fun BaseMenuBuilder.limeCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.limeCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.limeCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_CARPET, slots.toList(), block)

fun BaseMenuBuilder.limeConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.limeConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.limeGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.limeShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.limeStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.limeStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.limeTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.limeWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.limeWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LIME_WOOL, slots.toList(), block)

fun BaseMenuBuilder.lodestone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LODESTONE, slots.toList(), block)

fun BaseMenuBuilder.loom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LOOM, slots.toList(), block)

fun BaseMenuBuilder.magentaBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_BANNER, slots.toList(), block)

fun BaseMenuBuilder.magentaBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_BED, slots.toList(), block)

fun BaseMenuBuilder.magentaCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.magentaCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.magentaCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_CARPET, slots.toList(), block)

fun BaseMenuBuilder.magentaConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.magentaConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.magentaGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.magentaShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.magentaStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.magentaStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.magentaTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.magentaWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.magentaWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGENTA_WOOL, slots.toList(), block)

fun BaseMenuBuilder.magmaBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MAGMA_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.mangroveButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.mangroveDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_DOOR, slots.toList(), block)

fun BaseMenuBuilder.mangroveFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_FENCE, slots.toList(), block)

fun BaseMenuBuilder.mangroveFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.mangroveHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.mangroveLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.mangroveLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_LOG, slots.toList(), block)

fun BaseMenuBuilder.mangrovePlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.mangrovePressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.mangrovePropagule(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_PROPAGULE, slots.toList(), block)

fun BaseMenuBuilder.mangroveRoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_ROOTS, slots.toList(), block)

fun BaseMenuBuilder.mangroveSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_SIGN, slots.toList(), block)

fun BaseMenuBuilder.mangroveSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.mangroveStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.mangroveTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.mangroveWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.mangroveWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.mangroveWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MANGROVE_WOOD, slots.toList(), block)

fun BaseMenuBuilder.mediumAmethystBud(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MEDIUM_AMETHYST_BUD, slots.toList(), block)

fun BaseMenuBuilder.melon(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MELON, slots.toList(), block)

fun BaseMenuBuilder.melonStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MELON_STEM, slots.toList(), block)

fun BaseMenuBuilder.mossBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSS_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.mossCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSS_CARPET, slots.toList(), block)

fun BaseMenuBuilder.mossyCobblestone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSSY_COBBLESTONE, slots.toList(), block)

fun BaseMenuBuilder.mossyCobblestoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSSY_COBBLESTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.mossyCobblestoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSSY_COBBLESTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.mossyCobblestoneWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSSY_COBBLESTONE_WALL, slots.toList(), block)

fun BaseMenuBuilder.mossyStoneBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSSY_STONE_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.mossyStoneBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSSY_STONE_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.mossyStoneBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSSY_STONE_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.mossyStoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOSSY_STONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.movingPiston(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MOVING_PISTON, slots.toList(), block)

fun BaseMenuBuilder.mud(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUD, slots.toList(), block)

fun BaseMenuBuilder.mudBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUD_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.mudBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUD_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.mudBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUD_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.mudBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUD_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.muddyMangroveRoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUDDY_MANGROVE_ROOTS, slots.toList(), block)

fun BaseMenuBuilder.mushroomStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MUSHROOM_STEM, slots.toList(), block)

fun BaseMenuBuilder.mycelium(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.MYCELIUM, slots.toList(), block)

fun BaseMenuBuilder.netherBrickFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_BRICK_FENCE, slots.toList(), block)

fun BaseMenuBuilder.netherBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.netherBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.netherBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.netherBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.netherGoldOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_GOLD_ORE, slots.toList(), block)

fun BaseMenuBuilder.netherPortal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_PORTAL, slots.toList(), block)

fun BaseMenuBuilder.netherQuartzOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_QUARTZ_ORE, slots.toList(), block)

fun BaseMenuBuilder.netherSprouts(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_SPROUTS, slots.toList(), block)

fun BaseMenuBuilder.netherWart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_WART, slots.toList(), block)

fun BaseMenuBuilder.netherWartBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHER_WART_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.netheriteBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERITE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.netherrack(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NETHERRACK, slots.toList(), block)

fun BaseMenuBuilder.noteBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.NOTE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.oakButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.oakDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_DOOR, slots.toList(), block)

fun BaseMenuBuilder.oakFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_FENCE, slots.toList(), block)

fun BaseMenuBuilder.oakFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.oakHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.oakLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.oakLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_LOG, slots.toList(), block)

fun BaseMenuBuilder.oakPlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.oakPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.oakSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.oakSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_SIGN, slots.toList(), block)

fun BaseMenuBuilder.oakSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.oakStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.oakTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.oakWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.oakWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.oakWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OAK_WOOD, slots.toList(), block)

fun BaseMenuBuilder.observer(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OBSERVER, slots.toList(), block)

fun BaseMenuBuilder.obsidian(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OBSIDIAN, slots.toList(), block)

fun BaseMenuBuilder.ochreFroglight(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OCHRE_FROGLIGHT, slots.toList(), block)

fun BaseMenuBuilder.openEyeblossom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OPEN_EYEBLOSSOM, slots.toList(), block)

fun BaseMenuBuilder.orangeBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_BANNER, slots.toList(), block)

fun BaseMenuBuilder.orangeBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_BED, slots.toList(), block)

fun BaseMenuBuilder.orangeCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.orangeCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.orangeCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_CARPET, slots.toList(), block)

fun BaseMenuBuilder.orangeConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.orangeConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.orangeGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.orangeShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.orangeStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.orangeStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.orangeTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.orangeTulip(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_TULIP, slots.toList(), block)

fun BaseMenuBuilder.orangeWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.orangeWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ORANGE_WOOL, slots.toList(), block)

fun BaseMenuBuilder.oxeyeDaisy(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXEYE_DAISY, slots.toList(), block)

fun BaseMenuBuilder.oxidizedChiseledCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXIDIZED_CHISELED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.oxidizedCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXIDIZED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.oxidizedCopperBulb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXIDIZED_COPPER_BULB, slots.toList(), block)

fun BaseMenuBuilder.oxidizedCopperDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXIDIZED_COPPER_DOOR, slots.toList(), block)

fun BaseMenuBuilder.oxidizedCopperGrate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXIDIZED_COPPER_GRATE, slots.toList(), block)

fun BaseMenuBuilder.oxidizedCopperTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXIDIZED_COPPER_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.oxidizedCutCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXIDIZED_CUT_COPPER, slots.toList(), block)

fun BaseMenuBuilder.oxidizedCutCopperSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXIDIZED_CUT_COPPER_SLAB, slots.toList(), block)

fun BaseMenuBuilder.oxidizedCutCopperStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.OXIDIZED_CUT_COPPER_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.packedIce(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PACKED_ICE, slots.toList(), block)

fun BaseMenuBuilder.packedMud(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PACKED_MUD, slots.toList(), block)

fun BaseMenuBuilder.paleHangingMoss(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_HANGING_MOSS, slots.toList(), block)

fun BaseMenuBuilder.paleMossBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_MOSS_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.paleMossCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_MOSS_CARPET, slots.toList(), block)

fun BaseMenuBuilder.paleOakButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.paleOakDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_DOOR, slots.toList(), block)

fun BaseMenuBuilder.paleOakFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_FENCE, slots.toList(), block)

fun BaseMenuBuilder.paleOakFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.paleOakHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.paleOakLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.paleOakLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_LOG, slots.toList(), block)

fun BaseMenuBuilder.paleOakPlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.paleOakPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.paleOakSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.paleOakSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_SIGN, slots.toList(), block)

fun BaseMenuBuilder.paleOakSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.paleOakStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.paleOakTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.paleOakWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.paleOakWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.paleOakWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PALE_OAK_WOOD, slots.toList(), block)

fun BaseMenuBuilder.pearlescentFroglight(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PEARLESCENT_FROGLIGHT, slots.toList(), block)

fun BaseMenuBuilder.peony(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PEONY, slots.toList(), block)

fun BaseMenuBuilder.petrifiedOakSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PETRIFIED_OAK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.piglinHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PIGLIN_HEAD, slots.toList(), block)

fun BaseMenuBuilder.piglinWallHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PIGLIN_WALL_HEAD, slots.toList(), block)

fun BaseMenuBuilder.pinkBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_BANNER, slots.toList(), block)

fun BaseMenuBuilder.pinkBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_BED, slots.toList(), block)

fun BaseMenuBuilder.pinkCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.pinkCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.pinkCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_CARPET, slots.toList(), block)

fun BaseMenuBuilder.pinkConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.pinkConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.pinkGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.pinkPetals(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_PETALS, slots.toList(), block)

fun BaseMenuBuilder.pinkShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.pinkStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.pinkStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.pinkTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.pinkTulip(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_TULIP, slots.toList(), block)

fun BaseMenuBuilder.pinkWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.pinkWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PINK_WOOL, slots.toList(), block)

fun BaseMenuBuilder.piston(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PISTON, slots.toList(), block)

fun BaseMenuBuilder.pistonHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PISTON_HEAD, slots.toList(), block)

fun BaseMenuBuilder.pitcherCrop(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PITCHER_CROP, slots.toList(), block)

fun BaseMenuBuilder.pitcherPlant(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PITCHER_PLANT, slots.toList(), block)

fun BaseMenuBuilder.playerHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PLAYER_HEAD, slots.toList(), block)

fun BaseMenuBuilder.playerWallHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PLAYER_WALL_HEAD, slots.toList(), block)

fun BaseMenuBuilder.podzol(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PODZOL, slots.toList(), block)

fun BaseMenuBuilder.pointedDripstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POINTED_DRIPSTONE, slots.toList(), block)

fun BaseMenuBuilder.polishedAndesite(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_ANDESITE, slots.toList(), block)

fun BaseMenuBuilder.polishedAndesiteSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_ANDESITE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.polishedAndesiteStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_ANDESITE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.polishedBasalt(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BASALT, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstoneBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstoneBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstoneBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstoneButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstonePressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.polishedBlackstoneWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_BLACKSTONE_WALL, slots.toList(), block)

fun BaseMenuBuilder.polishedDeepslate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_DEEPSLATE, slots.toList(), block)

fun BaseMenuBuilder.polishedDeepslateSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_DEEPSLATE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.polishedDeepslateStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_DEEPSLATE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.polishedDeepslateWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_DEEPSLATE_WALL, slots.toList(), block)

fun BaseMenuBuilder.polishedDiorite(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_DIORITE, slots.toList(), block)

fun BaseMenuBuilder.polishedDioriteSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_DIORITE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.polishedDioriteStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_DIORITE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.polishedGranite(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_GRANITE, slots.toList(), block)

fun BaseMenuBuilder.polishedGraniteSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_GRANITE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.polishedGraniteStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_GRANITE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.polishedTuff(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_TUFF, slots.toList(), block)

fun BaseMenuBuilder.polishedTuffSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_TUFF_SLAB, slots.toList(), block)

fun BaseMenuBuilder.polishedTuffStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_TUFF_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.polishedTuffWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POLISHED_TUFF_WALL, slots.toList(), block)

fun BaseMenuBuilder.poppy(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POPPY, slots.toList(), block)

fun BaseMenuBuilder.potatoes(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTATOES, slots.toList(), block)

fun BaseMenuBuilder.pottedAcaciaSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_ACACIA_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.pottedAllium(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_ALLIUM, slots.toList(), block)

fun BaseMenuBuilder.pottedAzaleaBush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_AZALEA_BUSH, slots.toList(), block)

fun BaseMenuBuilder.pottedAzureBluet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_AZURE_BLUET, slots.toList(), block)

fun BaseMenuBuilder.pottedBamboo(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_BAMBOO, slots.toList(), block)

fun BaseMenuBuilder.pottedBirchSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_BIRCH_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.pottedBlueOrchid(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_BLUE_ORCHID, slots.toList(), block)

fun BaseMenuBuilder.pottedBrownMushroom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_BROWN_MUSHROOM, slots.toList(), block)

fun BaseMenuBuilder.pottedCactus(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_CACTUS, slots.toList(), block)

fun BaseMenuBuilder.pottedCherrySapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_CHERRY_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.pottedClosedEyeblossom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_CLOSED_EYEBLOSSOM, slots.toList(), block)

fun BaseMenuBuilder.pottedCornflower(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_CORNFLOWER, slots.toList(), block)

fun BaseMenuBuilder.pottedCrimsonFungus(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_CRIMSON_FUNGUS, slots.toList(), block)

fun BaseMenuBuilder.pottedCrimsonRoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_CRIMSON_ROOTS, slots.toList(), block)

fun BaseMenuBuilder.pottedDandelion(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_DANDELION, slots.toList(), block)

fun BaseMenuBuilder.pottedDarkOakSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_DARK_OAK_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.pottedDeadBush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_DEAD_BUSH, slots.toList(), block)

fun BaseMenuBuilder.pottedFern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_FERN, slots.toList(), block)

fun BaseMenuBuilder.pottedFloweringAzaleaBush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_FLOWERING_AZALEA_BUSH, slots.toList(), block)

fun BaseMenuBuilder.pottedJungleSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_JUNGLE_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.pottedLilyOfTheValley(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_LILY_OF_THE_VALLEY, slots.toList(), block)

fun BaseMenuBuilder.pottedMangrovePropagule(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_MANGROVE_PROPAGULE, slots.toList(), block)

fun BaseMenuBuilder.pottedOakSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_OAK_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.pottedOpenEyeblossom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_OPEN_EYEBLOSSOM, slots.toList(), block)

fun BaseMenuBuilder.pottedOrangeTulip(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_ORANGE_TULIP, slots.toList(), block)

fun BaseMenuBuilder.pottedOxeyeDaisy(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_OXEYE_DAISY, slots.toList(), block)

fun BaseMenuBuilder.pottedPaleOakSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_PALE_OAK_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.pottedPinkTulip(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_PINK_TULIP, slots.toList(), block)

fun BaseMenuBuilder.pottedPoppy(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_POPPY, slots.toList(), block)

fun BaseMenuBuilder.pottedRedMushroom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_RED_MUSHROOM, slots.toList(), block)

fun BaseMenuBuilder.pottedRedTulip(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_RED_TULIP, slots.toList(), block)

fun BaseMenuBuilder.pottedSpruceSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_SPRUCE_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.pottedTorchflower(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_TORCHFLOWER, slots.toList(), block)

fun BaseMenuBuilder.pottedWarpedFungus(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_WARPED_FUNGUS, slots.toList(), block)

fun BaseMenuBuilder.pottedWarpedRoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_WARPED_ROOTS, slots.toList(), block)

fun BaseMenuBuilder.pottedWhiteTulip(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_WHITE_TULIP, slots.toList(), block)

fun BaseMenuBuilder.pottedWitherRose(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POTTED_WITHER_ROSE, slots.toList(), block)

fun BaseMenuBuilder.powderSnow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POWDER_SNOW, slots.toList(), block)

fun BaseMenuBuilder.powderSnowCauldron(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POWDER_SNOW_CAULDRON, slots.toList(), block)

fun BaseMenuBuilder.poweredRail(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.POWERED_RAIL, slots.toList(), block)

fun BaseMenuBuilder.prismarine(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRISMARINE, slots.toList(), block)

fun BaseMenuBuilder.prismarineBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRISMARINE_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.prismarineBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRISMARINE_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.prismarineBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRISMARINE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.prismarineSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRISMARINE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.prismarineStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRISMARINE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.prismarineWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PRISMARINE_WALL, slots.toList(), block)

fun BaseMenuBuilder.pumpkin(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PUMPKIN, slots.toList(), block)

fun BaseMenuBuilder.pumpkinStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PUMPKIN_STEM, slots.toList(), block)

fun BaseMenuBuilder.purpleBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_BANNER, slots.toList(), block)

fun BaseMenuBuilder.purpleBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_BED, slots.toList(), block)

fun BaseMenuBuilder.purpleCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.purpleCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.purpleCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_CARPET, slots.toList(), block)

fun BaseMenuBuilder.purpleConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.purpleConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.purpleGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.purpleShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.purpleStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.purpleStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.purpleTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.purpleWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.purpleWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPLE_WOOL, slots.toList(), block)

fun BaseMenuBuilder.purpurBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPUR_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.purpurPillar(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPUR_PILLAR, slots.toList(), block)

fun BaseMenuBuilder.purpurSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPUR_SLAB, slots.toList(), block)

fun BaseMenuBuilder.purpurStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.PURPUR_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.quartzBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.QUARTZ_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.quartzBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.QUARTZ_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.quartzPillar(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.QUARTZ_PILLAR, slots.toList(), block)

fun BaseMenuBuilder.quartzSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.QUARTZ_SLAB, slots.toList(), block)

fun BaseMenuBuilder.quartzStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.QUARTZ_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.rail(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RAIL, slots.toList(), block)

fun BaseMenuBuilder.rawCopperBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RAW_COPPER_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.rawGoldBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RAW_GOLD_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.rawIronBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RAW_IRON_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.redBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_BANNER, slots.toList(), block)

fun BaseMenuBuilder.redBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_BED, slots.toList(), block)

fun BaseMenuBuilder.redCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.redCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.redCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_CARPET, slots.toList(), block)

fun BaseMenuBuilder.redConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.redConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.redGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.redMushroom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_MUSHROOM, slots.toList(), block)

fun BaseMenuBuilder.redMushroomBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_MUSHROOM_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.redNetherBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_NETHER_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.redNetherBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_NETHER_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.redNetherBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_NETHER_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.redNetherBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_NETHER_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.redSand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_SAND, slots.toList(), block)

fun BaseMenuBuilder.redSandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.redSandstoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_SANDSTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.redSandstoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_SANDSTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.redSandstoneWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_SANDSTONE_WALL, slots.toList(), block)

fun BaseMenuBuilder.redShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.redStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.redStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.redTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.redTulip(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_TULIP, slots.toList(), block)

fun BaseMenuBuilder.redWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.redWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RED_WOOL, slots.toList(), block)

fun BaseMenuBuilder.redstoneBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REDSTONE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.redstoneLamp(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REDSTONE_LAMP, slots.toList(), block)

fun BaseMenuBuilder.redstoneOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REDSTONE_ORE, slots.toList(), block)

fun BaseMenuBuilder.redstoneTorch(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REDSTONE_TORCH, slots.toList(), block)

fun BaseMenuBuilder.redstoneWallTorch(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REDSTONE_WALL_TORCH, slots.toList(), block)

fun BaseMenuBuilder.redstoneWire(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REDSTONE_WIRE, slots.toList(), block)

fun BaseMenuBuilder.reinforcedDeepslate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REINFORCED_DEEPSLATE, slots.toList(), block)

fun BaseMenuBuilder.repeater(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REPEATER, slots.toList(), block)

fun BaseMenuBuilder.repeatingCommandBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.REPEATING_COMMAND_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.resinBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RESIN_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.resinBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RESIN_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.resinBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RESIN_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.resinBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RESIN_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.resinBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RESIN_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.resinClump(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RESIN_CLUMP, slots.toList(), block)

fun BaseMenuBuilder.respawnAnchor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.RESPAWN_ANCHOR, slots.toList(), block)

fun BaseMenuBuilder.rootedDirt(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ROOTED_DIRT, slots.toList(), block)

fun BaseMenuBuilder.roseBush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ROSE_BUSH, slots.toList(), block)

fun BaseMenuBuilder.sand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SAND, slots.toList(), block)

fun BaseMenuBuilder.sandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.sandstoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SANDSTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.sandstoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SANDSTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.sandstoneWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SANDSTONE_WALL, slots.toList(), block)

fun BaseMenuBuilder.scaffolding(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SCAFFOLDING, slots.toList(), block)

fun BaseMenuBuilder.sculk(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SCULK, slots.toList(), block)

fun BaseMenuBuilder.sculkCatalyst(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SCULK_CATALYST, slots.toList(), block)

fun BaseMenuBuilder.sculkSensor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SCULK_SENSOR, slots.toList(), block)

fun BaseMenuBuilder.sculkShrieker(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SCULK_SHRIEKER, slots.toList(), block)

fun BaseMenuBuilder.sculkVein(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SCULK_VEIN, slots.toList(), block)

fun BaseMenuBuilder.seaLantern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SEA_LANTERN, slots.toList(), block)

fun BaseMenuBuilder.seaPickle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SEA_PICKLE, slots.toList(), block)

fun BaseMenuBuilder.seagrass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SEAGRASS, slots.toList(), block)

fun BaseMenuBuilder.shortDryGrass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHORT_DRY_GRASS, slots.toList(), block)

fun BaseMenuBuilder.shortGrass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHORT_GRASS, slots.toList(), block)

fun BaseMenuBuilder.shroomlight(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHROOMLIGHT, slots.toList(), block)

fun BaseMenuBuilder.shulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.skeletonSkull(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SKELETON_SKULL, slots.toList(), block)

fun BaseMenuBuilder.skeletonWallSkull(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SKELETON_WALL_SKULL, slots.toList(), block)

fun BaseMenuBuilder.slimeBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SLIME_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.smallAmethystBud(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMALL_AMETHYST_BUD, slots.toList(), block)

fun BaseMenuBuilder.smallDripleaf(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMALL_DRIPLEAF, slots.toList(), block)

fun BaseMenuBuilder.smithingTable(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMITHING_TABLE, slots.toList(), block)

fun BaseMenuBuilder.smoker(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOKER, slots.toList(), block)

fun BaseMenuBuilder.smoothBasalt(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_BASALT, slots.toList(), block)

fun BaseMenuBuilder.smoothQuartz(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_QUARTZ, slots.toList(), block)

fun BaseMenuBuilder.smoothQuartzSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_QUARTZ_SLAB, slots.toList(), block)

fun BaseMenuBuilder.smoothQuartzStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_QUARTZ_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.smoothRedSandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_RED_SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.smoothRedSandstoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_RED_SANDSTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.smoothRedSandstoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_RED_SANDSTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.smoothSandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.smoothSandstoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_SANDSTONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.smoothSandstoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_SANDSTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.smoothStone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_STONE, slots.toList(), block)

fun BaseMenuBuilder.smoothStoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SMOOTH_STONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.snifferEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SNIFFER_EGG, slots.toList(), block)

fun BaseMenuBuilder.snow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SNOW, slots.toList(), block)

fun BaseMenuBuilder.snowBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SNOW_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.soulCampfire(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SOUL_CAMPFIRE, slots.toList(), block)

fun BaseMenuBuilder.soulFire(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SOUL_FIRE, slots.toList(), block)

fun BaseMenuBuilder.soulLantern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SOUL_LANTERN, slots.toList(), block)

fun BaseMenuBuilder.soulSand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SOUL_SAND, slots.toList(), block)

fun BaseMenuBuilder.soulSoil(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SOUL_SOIL, slots.toList(), block)

fun BaseMenuBuilder.soulTorch(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SOUL_TORCH, slots.toList(), block)

fun BaseMenuBuilder.soulWallTorch(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SOUL_WALL_TORCH, slots.toList(), block)

fun BaseMenuBuilder.spawner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPAWNER, slots.toList(), block)

fun BaseMenuBuilder.sponge(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPONGE, slots.toList(), block)

fun BaseMenuBuilder.sporeBlossom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPORE_BLOSSOM, slots.toList(), block)

fun BaseMenuBuilder.spruceButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.spruceDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_DOOR, slots.toList(), block)

fun BaseMenuBuilder.spruceFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_FENCE, slots.toList(), block)

fun BaseMenuBuilder.spruceFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.spruceHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.spruceLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.spruceLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_LOG, slots.toList(), block)

fun BaseMenuBuilder.sprucePlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.sprucePressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.spruceSapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.spruceSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_SIGN, slots.toList(), block)

fun BaseMenuBuilder.spruceSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.spruceStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.spruceTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.spruceWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.spruceWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.spruceWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SPRUCE_WOOD, slots.toList(), block)

fun BaseMenuBuilder.stickyPiston(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STICKY_PISTON, slots.toList(), block)

fun BaseMenuBuilder.stone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE, slots.toList(), block)

fun BaseMenuBuilder.stoneBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.stoneBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.stoneBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.stoneBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.stoneButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.stonePressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.stoneSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.stoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.stonecutter(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STONECUTTER, slots.toList(), block)

fun BaseMenuBuilder.strippedAcaciaLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_ACACIA_LOG, slots.toList(), block)

fun BaseMenuBuilder.strippedAcaciaWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_ACACIA_WOOD, slots.toList(), block)

fun BaseMenuBuilder.strippedBambooBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_BAMBOO_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.strippedBirchLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_BIRCH_LOG, slots.toList(), block)

fun BaseMenuBuilder.strippedBirchWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_BIRCH_WOOD, slots.toList(), block)

fun BaseMenuBuilder.strippedCherryLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_CHERRY_LOG, slots.toList(), block)

fun BaseMenuBuilder.strippedCherryWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_CHERRY_WOOD, slots.toList(), block)

fun BaseMenuBuilder.strippedCrimsonHyphae(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_CRIMSON_HYPHAE, slots.toList(), block)

fun BaseMenuBuilder.strippedCrimsonStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_CRIMSON_STEM, slots.toList(), block)

fun BaseMenuBuilder.strippedDarkOakLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_DARK_OAK_LOG, slots.toList(), block)

fun BaseMenuBuilder.strippedDarkOakWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_DARK_OAK_WOOD, slots.toList(), block)

fun BaseMenuBuilder.strippedJungleLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_JUNGLE_LOG, slots.toList(), block)

fun BaseMenuBuilder.strippedJungleWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_JUNGLE_WOOD, slots.toList(), block)

fun BaseMenuBuilder.strippedMangroveLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_MANGROVE_LOG, slots.toList(), block)

fun BaseMenuBuilder.strippedMangroveWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_MANGROVE_WOOD, slots.toList(), block)

fun BaseMenuBuilder.strippedOakLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_OAK_LOG, slots.toList(), block)

fun BaseMenuBuilder.strippedOakWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_OAK_WOOD, slots.toList(), block)

fun BaseMenuBuilder.strippedPaleOakLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_PALE_OAK_LOG, slots.toList(), block)

fun BaseMenuBuilder.strippedPaleOakWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_PALE_OAK_WOOD, slots.toList(), block)

fun BaseMenuBuilder.strippedSpruceLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_SPRUCE_LOG, slots.toList(), block)

fun BaseMenuBuilder.strippedSpruceWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_SPRUCE_WOOD, slots.toList(), block)

fun BaseMenuBuilder.strippedWarpedHyphae(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_WARPED_HYPHAE, slots.toList(), block)

fun BaseMenuBuilder.strippedWarpedStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRIPPED_WARPED_STEM, slots.toList(), block)

fun BaseMenuBuilder.structureBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRUCTURE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.structureVoid(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.STRUCTURE_VOID, slots.toList(), block)

fun BaseMenuBuilder.sugarCane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SUGAR_CANE, slots.toList(), block)

fun BaseMenuBuilder.sunflower(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SUNFLOWER, slots.toList(), block)

fun BaseMenuBuilder.suspiciousGravel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SUSPICIOUS_GRAVEL, slots.toList(), block)

fun BaseMenuBuilder.suspiciousSand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SUSPICIOUS_SAND, slots.toList(), block)

fun BaseMenuBuilder.sweetBerryBush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.SWEET_BERRY_BUSH, slots.toList(), block)

fun BaseMenuBuilder.tallDryGrass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TALL_DRY_GRASS, slots.toList(), block)

fun BaseMenuBuilder.tallGrass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TALL_GRASS, slots.toList(), block)

fun BaseMenuBuilder.tallSeagrass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TALL_SEAGRASS, slots.toList(), block)

fun BaseMenuBuilder.target(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TARGET, slots.toList(), block)

fun BaseMenuBuilder.terracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.testBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TEST_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.testInstanceBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TEST_INSTANCE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.tintedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TINTED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.tnt(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TNT, slots.toList(), block)

fun BaseMenuBuilder.torch(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TORCH, slots.toList(), block)

fun BaseMenuBuilder.torchflower(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TORCHFLOWER, slots.toList(), block)

fun BaseMenuBuilder.torchflowerCrop(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TORCHFLOWER_CROP, slots.toList(), block)

fun BaseMenuBuilder.trappedChest(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TRAPPED_CHEST, slots.toList(), block)

fun BaseMenuBuilder.trialSpawner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TRIAL_SPAWNER, slots.toList(), block)

fun BaseMenuBuilder.tripwire(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TRIPWIRE, slots.toList(), block)

fun BaseMenuBuilder.tripwireHook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TRIPWIRE_HOOK, slots.toList(), block)

fun BaseMenuBuilder.tubeCoral(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUBE_CORAL, slots.toList(), block)

fun BaseMenuBuilder.tubeCoralBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUBE_CORAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.tubeCoralFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUBE_CORAL_FAN, slots.toList(), block)

fun BaseMenuBuilder.tubeCoralWallFan(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUBE_CORAL_WALL_FAN, slots.toList(), block)

fun BaseMenuBuilder.tuff(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUFF, slots.toList(), block)

fun BaseMenuBuilder.tuffBrickSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUFF_BRICK_SLAB, slots.toList(), block)

fun BaseMenuBuilder.tuffBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUFF_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.tuffBrickWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUFF_BRICK_WALL, slots.toList(), block)

fun BaseMenuBuilder.tuffBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUFF_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.tuffSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUFF_SLAB, slots.toList(), block)

fun BaseMenuBuilder.tuffStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUFF_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.tuffWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TUFF_WALL, slots.toList(), block)

fun BaseMenuBuilder.turtleEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TURTLE_EGG, slots.toList(), block)

fun BaseMenuBuilder.twistingVines(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TWISTING_VINES, slots.toList(), block)

fun BaseMenuBuilder.twistingVinesPlant(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.TWISTING_VINES_PLANT, slots.toList(), block)

fun BaseMenuBuilder.vault(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.VAULT, slots.toList(), block)

fun BaseMenuBuilder.verdantFroglight(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.VERDANT_FROGLIGHT, slots.toList(), block)

fun BaseMenuBuilder.vine(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.VINE, slots.toList(), block)

fun BaseMenuBuilder.voidAir(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.VOID_AIR, slots.toList(), block)

fun BaseMenuBuilder.wallTorch(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WALL_TORCH, slots.toList(), block)

fun BaseMenuBuilder.warpedButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.warpedDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_DOOR, slots.toList(), block)

fun BaseMenuBuilder.warpedFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_FENCE, slots.toList(), block)

fun BaseMenuBuilder.warpedFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.warpedFungus(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_FUNGUS, slots.toList(), block)

fun BaseMenuBuilder.warpedHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.warpedHyphae(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_HYPHAE, slots.toList(), block)

fun BaseMenuBuilder.warpedNylium(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_NYLIUM, slots.toList(), block)

fun BaseMenuBuilder.warpedPlanks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_PLANKS, slots.toList(), block)

fun BaseMenuBuilder.warpedPressurePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_PRESSURE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.warpedRoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_ROOTS, slots.toList(), block)

fun BaseMenuBuilder.warpedSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_SIGN, slots.toList(), block)

fun BaseMenuBuilder.warpedSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_SLAB, slots.toList(), block)

fun BaseMenuBuilder.warpedStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.warpedStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_STEM, slots.toList(), block)

fun BaseMenuBuilder.warpedTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.warpedWallHangingSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_WALL_HANGING_SIGN, slots.toList(), block)

fun BaseMenuBuilder.warpedWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.warpedWartBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WARPED_WART_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.water(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WATER, slots.toList(), block)

fun BaseMenuBuilder.waterCauldron(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WATER_CAULDRON, slots.toList(), block)

fun BaseMenuBuilder.waxedChiseledCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_CHISELED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedCopperBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_COPPER_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.waxedCopperBulb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_COPPER_BULB, slots.toList(), block)

fun BaseMenuBuilder.waxedCopperDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_COPPER_DOOR, slots.toList(), block)

fun BaseMenuBuilder.waxedCopperGrate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_COPPER_GRATE, slots.toList(), block)

fun BaseMenuBuilder.waxedCopperTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_COPPER_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.waxedCutCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_CUT_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedCutCopperSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_CUT_COPPER_SLAB, slots.toList(), block)

fun BaseMenuBuilder.waxedCutCopperStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_CUT_COPPER_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.waxedExposedChiseledCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_EXPOSED_CHISELED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedExposedCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_EXPOSED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedExposedCopperBulb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_EXPOSED_COPPER_BULB, slots.toList(), block)

fun BaseMenuBuilder.waxedExposedCopperDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_EXPOSED_COPPER_DOOR, slots.toList(), block)

fun BaseMenuBuilder.waxedExposedCopperGrate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_EXPOSED_COPPER_GRATE, slots.toList(), block)

fun BaseMenuBuilder.waxedExposedCopperTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_EXPOSED_COPPER_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.waxedExposedCutCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_EXPOSED_CUT_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedExposedCutCopperSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_EXPOSED_CUT_COPPER_SLAB, slots.toList(), block)

fun BaseMenuBuilder.waxedExposedCutCopperStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_EXPOSED_CUT_COPPER_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.waxedOxidizedChiseledCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_OXIDIZED_CHISELED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedOxidizedCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_OXIDIZED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedOxidizedCopperBulb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_OXIDIZED_COPPER_BULB, slots.toList(), block)

fun BaseMenuBuilder.waxedOxidizedCopperDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_OXIDIZED_COPPER_DOOR, slots.toList(), block)

fun BaseMenuBuilder.waxedOxidizedCopperGrate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_OXIDIZED_COPPER_GRATE, slots.toList(), block)

fun BaseMenuBuilder.waxedOxidizedCopperTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_OXIDIZED_COPPER_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.waxedOxidizedCutCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_OXIDIZED_CUT_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedOxidizedCutCopperSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_OXIDIZED_CUT_COPPER_SLAB, slots.toList(), block)

fun BaseMenuBuilder.waxedOxidizedCutCopperStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.waxedWeatheredChiseledCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_WEATHERED_CHISELED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedWeatheredCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_WEATHERED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedWeatheredCopperBulb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_WEATHERED_COPPER_BULB, slots.toList(), block)

fun BaseMenuBuilder.waxedWeatheredCopperDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_WEATHERED_COPPER_DOOR, slots.toList(), block)

fun BaseMenuBuilder.waxedWeatheredCopperGrate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_WEATHERED_COPPER_GRATE, slots.toList(), block)

fun BaseMenuBuilder.waxedWeatheredCopperTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_WEATHERED_COPPER_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.waxedWeatheredCutCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_WEATHERED_CUT_COPPER, slots.toList(), block)

fun BaseMenuBuilder.waxedWeatheredCutCopperSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_WEATHERED_CUT_COPPER_SLAB, slots.toList(), block)

fun BaseMenuBuilder.waxedWeatheredCutCopperStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.weatheredChiseledCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEATHERED_CHISELED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.weatheredCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEATHERED_COPPER, slots.toList(), block)

fun BaseMenuBuilder.weatheredCopperBulb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEATHERED_COPPER_BULB, slots.toList(), block)

fun BaseMenuBuilder.weatheredCopperDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEATHERED_COPPER_DOOR, slots.toList(), block)

fun BaseMenuBuilder.weatheredCopperGrate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEATHERED_COPPER_GRATE, slots.toList(), block)

fun BaseMenuBuilder.weatheredCopperTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEATHERED_COPPER_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.weatheredCutCopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEATHERED_CUT_COPPER, slots.toList(), block)

fun BaseMenuBuilder.weatheredCutCopperSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEATHERED_CUT_COPPER_SLAB, slots.toList(), block)

fun BaseMenuBuilder.weatheredCutCopperStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEATHERED_CUT_COPPER_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.weepingVines(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEEPING_VINES, slots.toList(), block)

fun BaseMenuBuilder.weepingVinesPlant(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WEEPING_VINES_PLANT, slots.toList(), block)

fun BaseMenuBuilder.wetSponge(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WET_SPONGE, slots.toList(), block)

fun BaseMenuBuilder.wheat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHEAT, slots.toList(), block)

fun BaseMenuBuilder.whiteBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_BANNER, slots.toList(), block)

fun BaseMenuBuilder.whiteBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_BED, slots.toList(), block)

fun BaseMenuBuilder.whiteCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.whiteCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.whiteCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_CARPET, slots.toList(), block)

fun BaseMenuBuilder.whiteConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.whiteConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.whiteGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.whiteShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.whiteStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.whiteStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.whiteTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.whiteTulip(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_TULIP, slots.toList(), block)

fun BaseMenuBuilder.whiteWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.whiteWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WHITE_WOOL, slots.toList(), block)

fun BaseMenuBuilder.wildflowers(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WILDFLOWERS, slots.toList(), block)

fun BaseMenuBuilder.witherRose(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WITHER_ROSE, slots.toList(), block)

fun BaseMenuBuilder.witherSkeletonSkull(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WITHER_SKELETON_SKULL, slots.toList(), block)

fun BaseMenuBuilder.witherSkeletonWallSkull(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.WITHER_SKELETON_WALL_SKULL, slots.toList(), block)

fun BaseMenuBuilder.yellowBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_BANNER, slots.toList(), block)

fun BaseMenuBuilder.yellowBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_BED, slots.toList(), block)

fun BaseMenuBuilder.yellowCandle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_CANDLE, slots.toList(), block)

fun BaseMenuBuilder.yellowCandleCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_CANDLE_CAKE, slots.toList(), block)

fun BaseMenuBuilder.yellowCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_CARPET, slots.toList(), block)

fun BaseMenuBuilder.yellowConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.yellowConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.yellowGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.yellowShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.yellowStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.yellowStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.yellowTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.yellowWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.yellowWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.YELLOW_WOOL, slots.toList(), block)

fun BaseMenuBuilder.zombieHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ZOMBIE_HEAD, slots.toList(), block)

fun BaseMenuBuilder.zombieWallHead(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.ZOMBIE_WALL_HEAD, slots.toList(), block)

fun BaseMenuBuilder.legacyAir(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_AIR, slots.toList(), block)

fun BaseMenuBuilder.legacyStone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STONE, slots.toList(), block)

fun BaseMenuBuilder.legacyGrass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GRASS, slots.toList(), block)

fun BaseMenuBuilder.legacyDirt(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIRT, slots.toList(), block)

fun BaseMenuBuilder.legacyCobblestone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COBBLESTONE, slots.toList(), block)

fun BaseMenuBuilder.legacyWood(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD, slots.toList(), block)

fun BaseMenuBuilder.legacySapling(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SAPLING, slots.toList(), block)

fun BaseMenuBuilder.legacyBedrock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BEDROCK, slots.toList(), block)

fun BaseMenuBuilder.legacyWater(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WATER, slots.toList(), block)

fun BaseMenuBuilder.legacyStationaryWater(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STATIONARY_WATER, slots.toList(), block)

fun BaseMenuBuilder.legacyLava(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LAVA, slots.toList(), block)

fun BaseMenuBuilder.legacyStationaryLava(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STATIONARY_LAVA, slots.toList(), block)

fun BaseMenuBuilder.legacySand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SAND, slots.toList(), block)

fun BaseMenuBuilder.legacyGravel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GRAVEL, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_ORE, slots.toList(), block)

fun BaseMenuBuilder.legacyIronOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_ORE, slots.toList(), block)

fun BaseMenuBuilder.legacyCoalOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COAL_ORE, slots.toList(), block)

fun BaseMenuBuilder.legacyLog(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LOG, slots.toList(), block)

fun BaseMenuBuilder.legacyLeaves(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LEAVES, slots.toList(), block)

fun BaseMenuBuilder.legacySponge(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPONGE, slots.toList(), block)

fun BaseMenuBuilder.legacyGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GLASS, slots.toList(), block)

fun BaseMenuBuilder.legacyLapisOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LAPIS_ORE, slots.toList(), block)

fun BaseMenuBuilder.legacyLapisBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LAPIS_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyDispenser(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DISPENSER, slots.toList(), block)

fun BaseMenuBuilder.legacySandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.legacyNoteBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NOTE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyBedBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BED_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyPoweredRail(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_POWERED_RAIL, slots.toList(), block)

fun BaseMenuBuilder.legacyDetectorRail(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DETECTOR_RAIL, slots.toList(), block)

fun BaseMenuBuilder.legacyPistonStickyBase(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PISTON_STICKY_BASE, slots.toList(), block)

fun BaseMenuBuilder.legacyWeb(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WEB, slots.toList(), block)

fun BaseMenuBuilder.legacyLongGrass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LONG_GRASS, slots.toList(), block)

fun BaseMenuBuilder.legacyDeadBush(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DEAD_BUSH, slots.toList(), block)

fun BaseMenuBuilder.legacyPistonBase(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PISTON_BASE, slots.toList(), block)

fun BaseMenuBuilder.legacyPistonExtension(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PISTON_EXTENSION, slots.toList(), block)

fun BaseMenuBuilder.legacyWool(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOL, slots.toList(), block)

fun BaseMenuBuilder.legacyPistonMovingPiece(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PISTON_MOVING_PIECE, slots.toList(), block)

fun BaseMenuBuilder.legacyYellowFlower(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_YELLOW_FLOWER, slots.toList(), block)

fun BaseMenuBuilder.legacyRedRose(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RED_ROSE, slots.toList(), block)

fun BaseMenuBuilder.legacyBrownMushroom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BROWN_MUSHROOM, slots.toList(), block)

fun BaseMenuBuilder.legacyRedMushroom(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RED_MUSHROOM, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyIronBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyDoubleStep(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DOUBLE_STEP, slots.toList(), block)

fun BaseMenuBuilder.legacyStep(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STEP, slots.toList(), block)

fun BaseMenuBuilder.legacyBrick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BRICK, slots.toList(), block)

fun BaseMenuBuilder.legacyTnt(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_TNT, slots.toList(), block)

fun BaseMenuBuilder.legacyBookshelf(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOOKSHELF, slots.toList(), block)

fun BaseMenuBuilder.legacyMossyCobblestone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MOSSY_COBBLESTONE, slots.toList(), block)

fun BaseMenuBuilder.legacyObsidian(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_OBSIDIAN, slots.toList(), block)

fun BaseMenuBuilder.legacyTorch(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_TORCH, slots.toList(), block)

fun BaseMenuBuilder.legacyFire(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FIRE, slots.toList(), block)

fun BaseMenuBuilder.legacyMobSpawner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MOB_SPAWNER, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyChest(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CHEST, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneWire(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_WIRE, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_ORE, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyWorkbench(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WORKBENCH, slots.toList(), block)

fun BaseMenuBuilder.legacyCrops(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CROPS, slots.toList(), block)

fun BaseMenuBuilder.legacySoil(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SOIL, slots.toList(), block)

fun BaseMenuBuilder.legacyFurnace(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FURNACE, slots.toList(), block)

fun BaseMenuBuilder.legacyBurningFurnace(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BURNING_FURNACE, slots.toList(), block)

fun BaseMenuBuilder.legacySignPost(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SIGN_POST, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodenDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOODEN_DOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyLadder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LADDER, slots.toList(), block)

fun BaseMenuBuilder.legacyRails(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RAILS, slots.toList(), block)

fun BaseMenuBuilder.legacyCobblestoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COBBLESTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyWallSign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WALL_SIGN, slots.toList(), block)

fun BaseMenuBuilder.legacyLever(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LEVER, slots.toList(), block)

fun BaseMenuBuilder.legacyStonePlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STONE_PLATE, slots.toList(), block)

fun BaseMenuBuilder.legacyIronDoorBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_DOOR_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodPlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_PLATE, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_ORE, slots.toList(), block)

fun BaseMenuBuilder.legacyGlowingRedstoneOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GLOWING_REDSTONE_ORE, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneTorchOff(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_TORCH_OFF, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneTorchOn(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_TORCH_ON, slots.toList(), block)

fun BaseMenuBuilder.legacyStoneButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STONE_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.legacySnow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SNOW, slots.toList(), block)

fun BaseMenuBuilder.legacyIce(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ICE, slots.toList(), block)

fun BaseMenuBuilder.legacySnowBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SNOW_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyCactus(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CACTUS, slots.toList(), block)

fun BaseMenuBuilder.legacyClay(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CLAY, slots.toList(), block)

fun BaseMenuBuilder.legacySugarCaneBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SUGAR_CANE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyJukebox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_JUKEBOX, slots.toList(), block)

fun BaseMenuBuilder.legacyFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FENCE, slots.toList(), block)

fun BaseMenuBuilder.legacyPumpkin(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PUMPKIN, slots.toList(), block)

fun BaseMenuBuilder.legacyNetherrack(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NETHERRACK, slots.toList(), block)

fun BaseMenuBuilder.legacySoulSand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SOUL_SAND, slots.toList(), block)

fun BaseMenuBuilder.legacyGlowstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GLOWSTONE, slots.toList(), block)

fun BaseMenuBuilder.legacyPortal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PORTAL, slots.toList(), block)

fun BaseMenuBuilder.legacyJackOLantern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_JACK_O_LANTERN, slots.toList(), block)

fun BaseMenuBuilder.legacyCakeBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CAKE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyDiodeBlockOff(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIODE_BLOCK_OFF, slots.toList(), block)

fun BaseMenuBuilder.legacyDiodeBlockOn(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIODE_BLOCK_ON, slots.toList(), block)

fun BaseMenuBuilder.legacyStainedGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STAINED_GLASS, slots.toList(), block)

fun BaseMenuBuilder.legacyTrapDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_TRAP_DOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyMonsterEggs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MONSTER_EGGS, slots.toList(), block)

fun BaseMenuBuilder.legacySmoothBrick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SMOOTH_BRICK, slots.toList(), block)

fun BaseMenuBuilder.legacyHugeMushroom1(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_HUGE_MUSHROOM_1, slots.toList(), block)

fun BaseMenuBuilder.legacyHugeMushroom2(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_HUGE_MUSHROOM_2, slots.toList(), block)

fun BaseMenuBuilder.legacyIronFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_FENCE, slots.toList(), block)

fun BaseMenuBuilder.legacyThinGlass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_THIN_GLASS, slots.toList(), block)

fun BaseMenuBuilder.legacyMelonBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MELON_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyPumpkinStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PUMPKIN_STEM, slots.toList(), block)

fun BaseMenuBuilder.legacyMelonStem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MELON_STEM, slots.toList(), block)

fun BaseMenuBuilder.legacyVine(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_VINE, slots.toList(), block)

fun BaseMenuBuilder.legacyFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.legacyBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacySmoothStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SMOOTH_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyMycel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MYCEL, slots.toList(), block)

fun BaseMenuBuilder.legacyWaterLily(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WATER_LILY, slots.toList(), block)

fun BaseMenuBuilder.legacyNetherBrick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NETHER_BRICK, slots.toList(), block)

fun BaseMenuBuilder.legacyNetherFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NETHER_FENCE, slots.toList(), block)

fun BaseMenuBuilder.legacyNetherBrickStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NETHER_BRICK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyNetherWarts(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NETHER_WARTS, slots.toList(), block)

fun BaseMenuBuilder.legacyEnchantmentTable(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ENCHANTMENT_TABLE, slots.toList(), block)

fun BaseMenuBuilder.legacyBrewingStand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BREWING_STAND, slots.toList(), block)

fun BaseMenuBuilder.legacyCauldron(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CAULDRON, slots.toList(), block)

fun BaseMenuBuilder.legacyEnderPortal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ENDER_PORTAL, slots.toList(), block)

fun BaseMenuBuilder.legacyEnderPortalFrame(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ENDER_PORTAL_FRAME, slots.toList(), block)

fun BaseMenuBuilder.legacyEnderStone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ENDER_STONE, slots.toList(), block)

fun BaseMenuBuilder.legacyDragonEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DRAGON_EGG, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneLampOff(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_LAMP_OFF, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneLampOn(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_LAMP_ON, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodDoubleStep(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_DOUBLE_STEP, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodStep(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_STEP, slots.toList(), block)

fun BaseMenuBuilder.legacyCocoa(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COCOA, slots.toList(), block)

fun BaseMenuBuilder.legacySandstoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SANDSTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyEmeraldOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_EMERALD_ORE, slots.toList(), block)

fun BaseMenuBuilder.legacyEnderChest(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ENDER_CHEST, slots.toList(), block)

fun BaseMenuBuilder.legacyTripwireHook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_TRIPWIRE_HOOK, slots.toList(), block)

fun BaseMenuBuilder.legacyTripwire(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_TRIPWIRE, slots.toList(), block)

fun BaseMenuBuilder.legacyEmeraldBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_EMERALD_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacySpruceWoodStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPRUCE_WOOD_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyBirchWoodStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BIRCH_WOOD_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyJungleWoodStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_JUNGLE_WOOD_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyCommand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COMMAND, slots.toList(), block)

fun BaseMenuBuilder.legacyBeacon(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BEACON, slots.toList(), block)

fun BaseMenuBuilder.legacyCobbleWall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COBBLE_WALL, slots.toList(), block)

fun BaseMenuBuilder.legacyFlowerPot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FLOWER_POT, slots.toList(), block)

fun BaseMenuBuilder.legacyCarrot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CARROT, slots.toList(), block)

fun BaseMenuBuilder.legacyPotato(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_POTATO, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodButton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_BUTTON, slots.toList(), block)

fun BaseMenuBuilder.legacySkull(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SKULL, slots.toList(), block)

fun BaseMenuBuilder.legacyAnvil(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ANVIL, slots.toList(), block)

fun BaseMenuBuilder.legacyTrappedChest(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_TRAPPED_CHEST, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldPlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_PLATE, slots.toList(), block)

fun BaseMenuBuilder.legacyIronPlate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_PLATE, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneComparatorOff(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_COMPARATOR_OFF, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneComparatorOn(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_COMPARATOR_ON, slots.toList(), block)

fun BaseMenuBuilder.legacyDaylightDetector(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DAYLIGHT_DETECTOR, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyQuartzOre(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_QUARTZ_ORE, slots.toList(), block)

fun BaseMenuBuilder.legacyHopper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_HOPPER, slots.toList(), block)

fun BaseMenuBuilder.legacyQuartzBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_QUARTZ_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyQuartzStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_QUARTZ_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyActivatorRail(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ACTIVATOR_RAIL, slots.toList(), block)

fun BaseMenuBuilder.legacyDropper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DROPPER, slots.toList(), block)

fun BaseMenuBuilder.legacyStainedClay(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STAINED_CLAY, slots.toList(), block)

fun BaseMenuBuilder.legacyStainedGlassPane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STAINED_GLASS_PANE, slots.toList(), block)

fun BaseMenuBuilder.legacyLeaves2(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LEAVES_2, slots.toList(), block)

fun BaseMenuBuilder.legacyLog2(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LOG_2, slots.toList(), block)

fun BaseMenuBuilder.legacyAcaciaStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ACACIA_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyDarkOakStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DARK_OAK_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacySlimeBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SLIME_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyBarrier(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BARRIER, slots.toList(), block)

fun BaseMenuBuilder.legacyIronTrapdoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_TRAPDOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyPrismarine(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PRISMARINE, slots.toList(), block)

fun BaseMenuBuilder.legacySeaLantern(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SEA_LANTERN, slots.toList(), block)

fun BaseMenuBuilder.legacyHayBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_HAY_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyCarpet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CARPET, slots.toList(), block)

fun BaseMenuBuilder.legacyHardClay(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_HARD_CLAY, slots.toList(), block)

fun BaseMenuBuilder.legacyCoalBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COAL_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyPackedIce(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PACKED_ICE, slots.toList(), block)

fun BaseMenuBuilder.legacyDoublePlant(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DOUBLE_PLANT, slots.toList(), block)

fun BaseMenuBuilder.legacyStandingBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STANDING_BANNER, slots.toList(), block)

fun BaseMenuBuilder.legacyWallBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WALL_BANNER, slots.toList(), block)

fun BaseMenuBuilder.legacyDaylightDetectorInverted(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DAYLIGHT_DETECTOR_INVERTED, slots.toList(), block)

fun BaseMenuBuilder.legacyRedSandstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RED_SANDSTONE, slots.toList(), block)

fun BaseMenuBuilder.legacyRedSandstoneStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RED_SANDSTONE_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyDoubleStoneSlab2(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DOUBLE_STONE_SLAB2, slots.toList(), block)

fun BaseMenuBuilder.legacyStoneSlab2(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STONE_SLAB2, slots.toList(), block)

fun BaseMenuBuilder.legacySpruceFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPRUCE_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.legacyBirchFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BIRCH_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.legacyJungleFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_JUNGLE_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.legacyDarkOakFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DARK_OAK_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.legacyAcaciaFenceGate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ACACIA_FENCE_GATE, slots.toList(), block)

fun BaseMenuBuilder.legacySpruceFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPRUCE_FENCE, slots.toList(), block)

fun BaseMenuBuilder.legacyBirchFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BIRCH_FENCE, slots.toList(), block)

fun BaseMenuBuilder.legacyJungleFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_JUNGLE_FENCE, slots.toList(), block)

fun BaseMenuBuilder.legacyDarkOakFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DARK_OAK_FENCE, slots.toList(), block)

fun BaseMenuBuilder.legacyAcaciaFence(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ACACIA_FENCE, slots.toList(), block)

fun BaseMenuBuilder.legacySpruceDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPRUCE_DOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyBirchDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BIRCH_DOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyJungleDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_JUNGLE_DOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyAcaciaDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ACACIA_DOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyDarkOakDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DARK_OAK_DOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyEndRod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_END_ROD, slots.toList(), block)

fun BaseMenuBuilder.legacyChorusPlant(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CHORUS_PLANT, slots.toList(), block)

fun BaseMenuBuilder.legacyChorusFlower(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CHORUS_FLOWER, slots.toList(), block)

fun BaseMenuBuilder.legacyPurpurBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PURPUR_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyPurpurPillar(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PURPUR_PILLAR, slots.toList(), block)

fun BaseMenuBuilder.legacyPurpurStairs(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PURPUR_STAIRS, slots.toList(), block)

fun BaseMenuBuilder.legacyPurpurDoubleSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PURPUR_DOUBLE_SLAB, slots.toList(), block)

fun BaseMenuBuilder.legacyPurpurSlab(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PURPUR_SLAB, slots.toList(), block)

fun BaseMenuBuilder.legacyEndBricks(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_END_BRICKS, slots.toList(), block)

fun BaseMenuBuilder.legacyBeetrootBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BEETROOT_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyGrassPath(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GRASS_PATH, slots.toList(), block)

fun BaseMenuBuilder.legacyEndGateway(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_END_GATEWAY, slots.toList(), block)

fun BaseMenuBuilder.legacyCommandRepeating(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COMMAND_REPEATING, slots.toList(), block)

fun BaseMenuBuilder.legacyCommandChain(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COMMAND_CHAIN, slots.toList(), block)

fun BaseMenuBuilder.legacyFrostedIce(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FROSTED_ICE, slots.toList(), block)

fun BaseMenuBuilder.legacyMagma(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MAGMA, slots.toList(), block)

fun BaseMenuBuilder.legacyNetherWartBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NETHER_WART_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyRedNetherBrick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RED_NETHER_BRICK, slots.toList(), block)

fun BaseMenuBuilder.legacyBoneBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BONE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyStructureVoid(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STRUCTURE_VOID, slots.toList(), block)

fun BaseMenuBuilder.legacyObserver(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_OBSERVER, slots.toList(), block)

fun BaseMenuBuilder.legacyWhiteShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WHITE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyOrangeShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ORANGE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyMagentaShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MAGENTA_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyLightBlueShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LIGHT_BLUE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyYellowShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_YELLOW_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyLimeShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LIME_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyPinkShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PINK_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyGrayShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GRAY_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacySilverShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SILVER_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyCyanShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CYAN_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyPurpleShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PURPLE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyBlueShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BLUE_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyBrownShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BROWN_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyGreenShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GREEN_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyRedShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RED_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyBlackShulkerBox(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BLACK_SHULKER_BOX, slots.toList(), block)

fun BaseMenuBuilder.legacyWhiteGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WHITE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyOrangeGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ORANGE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyMagentaGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MAGENTA_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyLightBlueGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LIGHT_BLUE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyYellowGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_YELLOW_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyLimeGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LIME_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyPinkGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PINK_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyGrayGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GRAY_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacySilverGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SILVER_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyCyanGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CYAN_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyPurpleGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PURPLE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyBlueGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BLUE_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyBrownGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BROWN_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyGreenGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GREEN_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyRedGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RED_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyBlackGlazedTerracotta(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BLACK_GLAZED_TERRACOTTA, slots.toList(), block)

fun BaseMenuBuilder.legacyConcrete(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CONCRETE, slots.toList(), block)

fun BaseMenuBuilder.legacyConcretePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CONCRETE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.legacyStructureBlock(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STRUCTURE_BLOCK, slots.toList(), block)

fun BaseMenuBuilder.legacyIronSpade(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_SPADE, slots.toList(), block)

fun BaseMenuBuilder.legacyIronPickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.legacyIronAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_AXE, slots.toList(), block)

fun BaseMenuBuilder.legacyFlintAndSteel(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FLINT_AND_STEEL, slots.toList(), block)

fun BaseMenuBuilder.legacyApple(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_APPLE, slots.toList(), block)

fun BaseMenuBuilder.legacyBow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOW, slots.toList(), block)

fun BaseMenuBuilder.legacyArrow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ARROW, slots.toList(), block)

fun BaseMenuBuilder.legacyCoal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COAL, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamond(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND, slots.toList(), block)

fun BaseMenuBuilder.legacyIronIngot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_INGOT, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldIngot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_INGOT, slots.toList(), block)

fun BaseMenuBuilder.legacyIronSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_SWORD, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_SWORD, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodSpade(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_SPADE, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodPickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_AXE, slots.toList(), block)

fun BaseMenuBuilder.legacyStoneSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STONE_SWORD, slots.toList(), block)

fun BaseMenuBuilder.legacyStoneSpade(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STONE_SPADE, slots.toList(), block)

fun BaseMenuBuilder.legacyStonePickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STONE_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.legacyStoneAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STONE_AXE, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_SWORD, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondSpade(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_SPADE, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondPickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_AXE, slots.toList(), block)

fun BaseMenuBuilder.legacyStick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STICK, slots.toList(), block)

fun BaseMenuBuilder.legacyBowl(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOWL, slots.toList(), block)

fun BaseMenuBuilder.legacyMushroomSoup(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MUSHROOM_SOUP, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldSword(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_SWORD, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldSpade(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_SPADE, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldPickaxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_PICKAXE, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldAxe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_AXE, slots.toList(), block)

fun BaseMenuBuilder.legacyString(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STRING, slots.toList(), block)

fun BaseMenuBuilder.legacyFeather(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FEATHER, slots.toList(), block)

fun BaseMenuBuilder.legacySulphur(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SULPHUR, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_HOE, slots.toList(), block)

fun BaseMenuBuilder.legacyStoneHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STONE_HOE, slots.toList(), block)

fun BaseMenuBuilder.legacyIronHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_HOE, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_HOE, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldHoe(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_HOE, slots.toList(), block)

fun BaseMenuBuilder.legacySeeds(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SEEDS, slots.toList(), block)

fun BaseMenuBuilder.legacyWheat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WHEAT, slots.toList(), block)

fun BaseMenuBuilder.legacyBread(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BREAD, slots.toList(), block)

fun BaseMenuBuilder.legacyLeatherHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LEATHER_HELMET, slots.toList(), block)

fun BaseMenuBuilder.legacyLeatherChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LEATHER_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.legacyLeatherLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LEATHER_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.legacyLeatherBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LEATHER_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.legacyChainmailHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CHAINMAIL_HELMET, slots.toList(), block)

fun BaseMenuBuilder.legacyChainmailChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CHAINMAIL_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.legacyChainmailLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CHAINMAIL_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.legacyChainmailBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CHAINMAIL_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.legacyIronHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_HELMET, slots.toList(), block)

fun BaseMenuBuilder.legacyIronChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.legacyIronLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.legacyIronBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_HELMET, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldHelmet(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_HELMET, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldChestplate(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_CHESTPLATE, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldLeggings(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_LEGGINGS, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldBoots(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_BOOTS, slots.toList(), block)

fun BaseMenuBuilder.legacyFlint(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FLINT, slots.toList(), block)

fun BaseMenuBuilder.legacyPork(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PORK, slots.toList(), block)

fun BaseMenuBuilder.legacyGrilledPork(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GRILLED_PORK, slots.toList(), block)

fun BaseMenuBuilder.legacyPainting(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PAINTING, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldenApple(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLDEN_APPLE, slots.toList(), block)

fun BaseMenuBuilder.legacySign(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SIGN, slots.toList(), block)

fun BaseMenuBuilder.legacyWoodDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WOOD_DOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.legacyWaterBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WATER_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.legacyLavaBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LAVA_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.legacyMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MINECART, slots.toList(), block)

fun BaseMenuBuilder.legacySaddle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SADDLE, slots.toList(), block)

fun BaseMenuBuilder.legacyIronDoor(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_DOOR, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE, slots.toList(), block)

fun BaseMenuBuilder.legacySnowBall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SNOW_BALL, slots.toList(), block)

fun BaseMenuBuilder.legacyBoat(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOAT, slots.toList(), block)

fun BaseMenuBuilder.legacyLeather(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LEATHER, slots.toList(), block)

fun BaseMenuBuilder.legacyMilkBucket(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MILK_BUCKET, slots.toList(), block)

fun BaseMenuBuilder.legacyClayBrick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CLAY_BRICK, slots.toList(), block)

fun BaseMenuBuilder.legacyClayBall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CLAY_BALL, slots.toList(), block)

fun BaseMenuBuilder.legacySugarCane(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SUGAR_CANE, slots.toList(), block)

fun BaseMenuBuilder.legacyPaper(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PAPER, slots.toList(), block)

fun BaseMenuBuilder.legacyBook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOOK, slots.toList(), block)

fun BaseMenuBuilder.legacySlimeBall(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SLIME_BALL, slots.toList(), block)

fun BaseMenuBuilder.legacyStorageMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_STORAGE_MINECART, slots.toList(), block)

fun BaseMenuBuilder.legacyPoweredMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_POWERED_MINECART, slots.toList(), block)

fun BaseMenuBuilder.legacyEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_EGG, slots.toList(), block)

fun BaseMenuBuilder.legacyCompass(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COMPASS, slots.toList(), block)

fun BaseMenuBuilder.legacyFishingRod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FISHING_ROD, slots.toList(), block)

fun BaseMenuBuilder.legacyWatch(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WATCH, slots.toList(), block)

fun BaseMenuBuilder.legacyGlowstoneDust(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GLOWSTONE_DUST, slots.toList(), block)

fun BaseMenuBuilder.legacyRawFish(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RAW_FISH, slots.toList(), block)

fun BaseMenuBuilder.legacyCookedFish(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COOKED_FISH, slots.toList(), block)

fun BaseMenuBuilder.legacyInkSack(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_INK_SACK, slots.toList(), block)

fun BaseMenuBuilder.legacyBone(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BONE, slots.toList(), block)

fun BaseMenuBuilder.legacySugar(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SUGAR, slots.toList(), block)

fun BaseMenuBuilder.legacyCake(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CAKE, slots.toList(), block)

fun BaseMenuBuilder.legacyBed(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BED, slots.toList(), block)

fun BaseMenuBuilder.legacyDiode(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIODE, slots.toList(), block)

fun BaseMenuBuilder.legacyCookie(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COOKIE, slots.toList(), block)

fun BaseMenuBuilder.legacyMap(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MAP, slots.toList(), block)

fun BaseMenuBuilder.legacyShears(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SHEARS, slots.toList(), block)

fun BaseMenuBuilder.legacyMelon(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MELON, slots.toList(), block)

fun BaseMenuBuilder.legacyPumpkinSeeds(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PUMPKIN_SEEDS, slots.toList(), block)

fun BaseMenuBuilder.legacyMelonSeeds(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MELON_SEEDS, slots.toList(), block)

fun BaseMenuBuilder.legacyRawBeef(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RAW_BEEF, slots.toList(), block)

fun BaseMenuBuilder.legacyCookedBeef(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COOKED_BEEF, slots.toList(), block)

fun BaseMenuBuilder.legacyRawChicken(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RAW_CHICKEN, slots.toList(), block)

fun BaseMenuBuilder.legacyCookedChicken(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COOKED_CHICKEN, slots.toList(), block)

fun BaseMenuBuilder.legacyRottenFlesh(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ROTTEN_FLESH, slots.toList(), block)

fun BaseMenuBuilder.legacyEnderPearl(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ENDER_PEARL, slots.toList(), block)

fun BaseMenuBuilder.legacyBlazeRod(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BLAZE_ROD, slots.toList(), block)

fun BaseMenuBuilder.legacyGhastTear(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GHAST_TEAR, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldNugget(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_NUGGET, slots.toList(), block)

fun BaseMenuBuilder.legacyNetherStalk(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NETHER_STALK, slots.toList(), block)

fun BaseMenuBuilder.legacyPotion(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_POTION, slots.toList(), block)

fun BaseMenuBuilder.legacyGlassBottle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GLASS_BOTTLE, slots.toList(), block)

fun BaseMenuBuilder.legacySpiderEye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPIDER_EYE, slots.toList(), block)

fun BaseMenuBuilder.legacyFermentedSpiderEye(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FERMENTED_SPIDER_EYE, slots.toList(), block)

fun BaseMenuBuilder.legacyBlazePowder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BLAZE_POWDER, slots.toList(), block)

fun BaseMenuBuilder.legacyMagmaCream(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MAGMA_CREAM, slots.toList(), block)

fun BaseMenuBuilder.legacyBrewingStandItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BREWING_STAND_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyCauldronItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CAULDRON_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyEyeOfEnder(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_EYE_OF_ENDER, slots.toList(), block)

fun BaseMenuBuilder.legacySpeckledMelon(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPECKLED_MELON, slots.toList(), block)

fun BaseMenuBuilder.legacyMonsterEgg(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MONSTER_EGG, slots.toList(), block)

fun BaseMenuBuilder.legacyExpBottle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_EXP_BOTTLE, slots.toList(), block)

fun BaseMenuBuilder.legacyFireball(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FIREBALL, slots.toList(), block)

fun BaseMenuBuilder.legacyBookAndQuill(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOOK_AND_QUILL, slots.toList(), block)

fun BaseMenuBuilder.legacyWrittenBook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_WRITTEN_BOOK, slots.toList(), block)

fun BaseMenuBuilder.legacyEmerald(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_EMERALD, slots.toList(), block)

fun BaseMenuBuilder.legacyItemFrame(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ITEM_FRAME, slots.toList(), block)

fun BaseMenuBuilder.legacyFlowerPotItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FLOWER_POT_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyCarrotItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CARROT_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyPotatoItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_POTATO_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyBakedPotato(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BAKED_POTATO, slots.toList(), block)

fun BaseMenuBuilder.legacyPoisonousPotato(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_POISONOUS_POTATO, slots.toList(), block)

fun BaseMenuBuilder.legacyEmptyMap(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_EMPTY_MAP, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldenCarrot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLDEN_CARROT, slots.toList(), block)

fun BaseMenuBuilder.legacySkullItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SKULL_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyCarrotStick(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CARROT_STICK, slots.toList(), block)

fun BaseMenuBuilder.legacyNetherStar(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NETHER_STAR, slots.toList(), block)

fun BaseMenuBuilder.legacyPumpkinPie(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PUMPKIN_PIE, slots.toList(), block)

fun BaseMenuBuilder.legacyFirework(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FIREWORK, slots.toList(), block)

fun BaseMenuBuilder.legacyFireworkCharge(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_FIREWORK_CHARGE, slots.toList(), block)

fun BaseMenuBuilder.legacyEnchantedBook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ENCHANTED_BOOK, slots.toList(), block)

fun BaseMenuBuilder.legacyRedstoneComparator(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_REDSTONE_COMPARATOR, slots.toList(), block)

fun BaseMenuBuilder.legacyNetherBrickItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NETHER_BRICK_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyQuartz(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_QUARTZ, slots.toList(), block)

fun BaseMenuBuilder.legacyExplosiveMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_EXPLOSIVE_MINECART, slots.toList(), block)

fun BaseMenuBuilder.legacyHopperMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_HOPPER_MINECART, slots.toList(), block)

fun BaseMenuBuilder.legacyPrismarineShard(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PRISMARINE_SHARD, slots.toList(), block)

fun BaseMenuBuilder.legacyPrismarineCrystals(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_PRISMARINE_CRYSTALS, slots.toList(), block)

fun BaseMenuBuilder.legacyRabbit(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RABBIT, slots.toList(), block)

fun BaseMenuBuilder.legacyCookedRabbit(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COOKED_RABBIT, slots.toList(), block)

fun BaseMenuBuilder.legacyRabbitStew(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RABBIT_STEW, slots.toList(), block)

fun BaseMenuBuilder.legacyRabbitFoot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RABBIT_FOOT, slots.toList(), block)

fun BaseMenuBuilder.legacyRabbitHide(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RABBIT_HIDE, slots.toList(), block)

fun BaseMenuBuilder.legacyArmorStand(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ARMOR_STAND, slots.toList(), block)

fun BaseMenuBuilder.legacyIronBarding(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_BARDING, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldBarding(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_BARDING, slots.toList(), block)

fun BaseMenuBuilder.legacyDiamondBarding(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DIAMOND_BARDING, slots.toList(), block)

fun BaseMenuBuilder.legacyLeash(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LEASH, slots.toList(), block)

fun BaseMenuBuilder.legacyNameTag(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_NAME_TAG, slots.toList(), block)

fun BaseMenuBuilder.legacyCommandMinecart(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COMMAND_MINECART, slots.toList(), block)

fun BaseMenuBuilder.legacyMutton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_MUTTON, slots.toList(), block)

fun BaseMenuBuilder.legacyCookedMutton(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_COOKED_MUTTON, slots.toList(), block)

fun BaseMenuBuilder.legacyBanner(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BANNER, slots.toList(), block)

fun BaseMenuBuilder.legacyEndCrystal(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_END_CRYSTAL, slots.toList(), block)

fun BaseMenuBuilder.legacySpruceDoorItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPRUCE_DOOR_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyBirchDoorItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BIRCH_DOOR_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyJungleDoorItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_JUNGLE_DOOR_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyAcaciaDoorItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ACACIA_DOOR_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyDarkOakDoorItem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DARK_OAK_DOOR_ITEM, slots.toList(), block)

fun BaseMenuBuilder.legacyChorusFruit(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CHORUS_FRUIT, slots.toList(), block)

fun BaseMenuBuilder.legacyChorusFruitPopped(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_CHORUS_FRUIT_POPPED, slots.toList(), block)

fun BaseMenuBuilder.legacyBeetroot(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BEETROOT, slots.toList(), block)

fun BaseMenuBuilder.legacyBeetrootSeeds(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BEETROOT_SEEDS, slots.toList(), block)

fun BaseMenuBuilder.legacyBeetrootSoup(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BEETROOT_SOUP, slots.toList(), block)

fun BaseMenuBuilder.legacyDragonsBreath(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_DRAGONS_BREATH, slots.toList(), block)

fun BaseMenuBuilder.legacySplashPotion(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPLASH_POTION, slots.toList(), block)

fun BaseMenuBuilder.legacySpectralArrow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SPECTRAL_ARROW, slots.toList(), block)

fun BaseMenuBuilder.legacyTippedArrow(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_TIPPED_ARROW, slots.toList(), block)

fun BaseMenuBuilder.legacyLingeringPotion(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_LINGERING_POTION, slots.toList(), block)

fun BaseMenuBuilder.legacyShield(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SHIELD, slots.toList(), block)

fun BaseMenuBuilder.legacyElytra(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_ELYTRA, slots.toList(), block)

fun BaseMenuBuilder.legacyBoatSpruce(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOAT_SPRUCE, slots.toList(), block)

fun BaseMenuBuilder.legacyBoatBirch(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOAT_BIRCH, slots.toList(), block)

fun BaseMenuBuilder.legacyBoatJungle(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOAT_JUNGLE, slots.toList(), block)

fun BaseMenuBuilder.legacyBoatAcacia(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOAT_ACACIA, slots.toList(), block)

fun BaseMenuBuilder.legacyBoatDarkOak(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_BOAT_DARK_OAK, slots.toList(), block)

fun BaseMenuBuilder.legacyTotem(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_TOTEM, slots.toList(), block)

fun BaseMenuBuilder.legacyShulkerShell(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_SHULKER_SHELL, slots.toList(), block)

fun BaseMenuBuilder.legacyIronNugget(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_IRON_NUGGET, slots.toList(), block)

fun BaseMenuBuilder.legacyKnowledgeBook(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_KNOWLEDGE_BOOK, slots.toList(), block)

fun BaseMenuBuilder.legacyGoldRecord(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GOLD_RECORD, slots.toList(), block)

fun BaseMenuBuilder.legacyGreenRecord(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_GREEN_RECORD, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord3(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_3, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord4(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_4, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord5(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_5, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord6(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_6, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord7(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_7, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord8(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_8, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord9(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_9, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord10(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_10, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord11(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_11, slots.toList(), block)

fun BaseMenuBuilder.legacyRecord12(
    vararg slots: Int,
    block: MenuItem.() -> Unit = {}
) = item(Material.LEGACY_RECORD_12, slots.toList(), block)

