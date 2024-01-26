package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class RavnicaClueEdition extends ExpansionSet {

    private static final RavnicaClueEdition instance = new RavnicaClueEdition();

    public static RavnicaClueEdition getInstance() {
        return instance;
    }

    private RavnicaClueEdition() {
        super("Ravnica: Clue Edition", "CLU", ExpansionSet.buildDate(2024, 2, 9), SetType.EXPANSION);
        this.hasBasicLands = true;
        this.hasBoosters = false;

        cards.add(new SetCardInfo("Affectionate Indrik", 155, Rarity.UNCOMMON, mage.cards.a.AffectionateIndrik.class));
        cards.add(new SetCardInfo("Afterlife Insurance", 23, Rarity.UNCOMMON, mage.cards.a.AfterlifeInsurance.class));
        cards.add(new SetCardInfo("Ajani's Pridemate", 52, Rarity.UNCOMMON, mage.cards.a.AjanisPridemate.class));
        cards.add(new SetCardInfo("Angel of Vitality", 53, Rarity.UNCOMMON, mage.cards.a.AngelOfVitality.class));
        cards.add(new SetCardInfo("Azorius Arrester", 54, Rarity.COMMON, mage.cards.a.AzoriusArrester.class));
        cards.add(new SetCardInfo("Azorius Chancery", 229, Rarity.COMMON, mage.cards.a.AzoriusChancery.class));
        cards.add(new SetCardInfo("Azorius Guildgate", 230, Rarity.COMMON, mage.cards.a.AzoriusGuildgate.class));
        cards.add(new SetCardInfo("Azorius Justiciar", 55, Rarity.UNCOMMON, mage.cards.a.AzoriusJusticiar.class));
        cards.add(new SetCardInfo("Azorius Signet", 219, Rarity.COMMON, mage.cards.a.AzoriusSignet.class));
        cards.add(new SetCardInfo("Ballroom", 12, Rarity.UNCOMMON, mage.cards.b.Ballroom.class));
        cards.add(new SetCardInfo("Band Together", 156, Rarity.COMMON, mage.cards.b.BandTogether.class));
        cards.add(new SetCardInfo("Basilica Screecher", 105, Rarity.COMMON, mage.cards.b.BasilicaScreecher.class));
        cards.add(new SetCardInfo("Battlefront Krushok", 157, Rarity.UNCOMMON, mage.cards.b.BattlefrontKrushok.class));
        cards.add(new SetCardInfo("Beast Whisperer", 158, Rarity.RARE, mage.cards.b.BeastWhisperer.class));
        cards.add(new SetCardInfo("Billiard Room", 13, Rarity.UNCOMMON, mage.cards.b.BilliardRoom.class));
        cards.add(new SetCardInfo("Blade Juggler", 106, Rarity.COMMON, mage.cards.b.BladeJuggler.class));
        cards.add(new SetCardInfo("Blood Crypt", 274, Rarity.RARE, mage.cards.b.BloodCrypt.class));
        cards.add(new SetCardInfo("Boros Garrison", 231, Rarity.COMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Boros Guildgate", 232, Rarity.COMMON, mage.cards.b.BorosGuildgate.class));
        cards.add(new SetCardInfo("Boros Signet", 220, Rarity.COMMON, mage.cards.b.BorosSignet.class));
        cards.add(new SetCardInfo("Breeding Pool", 275, Rarity.RARE, mage.cards.b.BreedingPool.class));
        cards.add(new SetCardInfo("Candlestick", 8, Rarity.UNCOMMON, mage.cards.c.Candlestick.class));
        cards.add(new SetCardInfo("Carnage Interpreter", 26, Rarity.RARE, mage.cards.c.CarnageInterpreter.class));
        cards.add(new SetCardInfo("Chainwhip Cyclops", 127, Rarity.COMMON, mage.cards.c.ChainwhipCyclops.class));
        cards.add(new SetCardInfo("Challenger Troll", 159, Rarity.UNCOMMON, mage.cards.c.ChallengerTroll.class));
        cards.add(new SetCardInfo("Chemister's Insight", 81, Rarity.UNCOMMON, mage.cards.c.ChemistersInsight.class));
        cards.add(new SetCardInfo("Clan Defiance", 182, Rarity.RARE, mage.cards.c.ClanDefiance.class));
        cards.add(new SetCardInfo("Cloudkin Seer", 82, Rarity.COMMON, mage.cards.c.CloudkinSeer.class));
        cards.add(new SetCardInfo("Code of Constraint", 83, Rarity.UNCOMMON, mage.cards.c.CodeOfConstraint.class));
        cards.add(new SetCardInfo("Colossal Majesty", 160, Rarity.UNCOMMON, mage.cards.c.ColossalMajesty.class));
        cards.add(new SetCardInfo("Commander Mustard", 6, Rarity.RARE, mage.cards.c.CommanderMustard.class));
        cards.add(new SetCardInfo("Conclave Evangelist", 27, Rarity.RARE, mage.cards.c.ConclaveEvangelist.class));
        cards.add(new SetCardInfo("Conclave Tribunal", 56, Rarity.UNCOMMON, mage.cards.c.ConclaveTribunal.class));
        cards.add(new SetCardInfo("Conservatory", 14, Rarity.UNCOMMON, mage.cards.c.Conservatory.class));
        cards.add(new SetCardInfo("Consider", 84, Rarity.COMMON, mage.cards.c.Consider.class));
        cards.add(new SetCardInfo("Coordinated Assault", 128, Rarity.UNCOMMON, mage.cards.c.CoordinatedAssault.class));
        cards.add(new SetCardInfo("Corpse Churn", 107, Rarity.COMMON, mage.cards.c.CorpseChurn.class));
        cards.add(new SetCardInfo("Cosmotronic Wave", 129, Rarity.COMMON, mage.cards.c.CosmotronicWave.class));
        cards.add(new SetCardInfo("Council's Judgment", 57, Rarity.RARE, mage.cards.c.CouncilsJudgment.class));
        cards.add(new SetCardInfo("Curse of Chains", 183, Rarity.COMMON, mage.cards.c.CurseOfChains.class));
        cards.add(new SetCardInfo("Dagger Caster", 130, Rarity.UNCOMMON, mage.cards.d.DaggerCaster.class));
        cards.add(new SetCardInfo("Daggerclaw Imp", 108, Rarity.UNCOMMON, mage.cards.d.DaggerclawImp.class));
        cards.add(new SetCardInfo("Deadbridge Chant", 184, Rarity.MYTHIC, mage.cards.d.DeadbridgeChant.class));
        cards.add(new SetCardInfo("Deadly Dispute", 109, Rarity.COMMON, mage.cards.d.DeadlyDispute.class));
        cards.add(new SetCardInfo("Deadly Riposte", 58, Rarity.COMMON, mage.cards.d.DeadlyRiposte.class));
        cards.add(new SetCardInfo("Deal Gone Bad", 110, Rarity.COMMON, mage.cards.d.DealGoneBad.class));
        cards.add(new SetCardInfo("Depose // Deploy", 185, Rarity.UNCOMMON, mage.cards.d.DeposeDeploy.class));
        cards.add(new SetCardInfo("Deputized Protester", 131, Rarity.COMMON, mage.cards.d.DeputizedProtester.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 233, Rarity.COMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Dimir Guildgate", 234, Rarity.COMMON, mage.cards.d.DimirGuildgate.class));
        cards.add(new SetCardInfo("Dimir Guildmage", 186, Rarity.UNCOMMON, mage.cards.d.DimirGuildmage.class));
        cards.add(new SetCardInfo("Dimir Signet", 221, Rarity.COMMON, mage.cards.d.DimirSignet.class));
        cards.add(new SetCardInfo("Dining Room", 15, Rarity.UNCOMMON, mage.cards.d.DiningRoom.class));
        cards.add(new SetCardInfo("Direct Current", 132, Rarity.COMMON, mage.cards.d.DirectCurrent.class));
        cards.add(new SetCardInfo("Discovery // Dispersal", 187, Rarity.UNCOMMON, mage.cards.d.DiscoveryDispersal.class));
        cards.add(new SetCardInfo("Doomed Traveler", 59, Rarity.COMMON, mage.cards.d.DoomedTraveler.class));
        cards.add(new SetCardInfo("Duskmantle Seer", 188, Rarity.MYTHIC, mage.cards.d.DuskmantleSeer.class));
        cards.add(new SetCardInfo("Duskshell Crawler", 161, Rarity.COMMON, mage.cards.d.DuskshellCrawler.class));
        cards.add(new SetCardInfo("Ecstatic Electromancer", 31, Rarity.UNCOMMON, mage.cards.e.EcstaticElectromancer.class));
        cards.add(new SetCardInfo("Enforcer Griffin", 60, Rarity.COMMON, mage.cards.e.EnforcerGriffin.class));
        cards.add(new SetCardInfo("Enraged Ceratok", 162, Rarity.UNCOMMON, mage.cards.e.EnragedCeratok.class));
        cards.add(new SetCardInfo("Erratic Visionary", 85, Rarity.COMMON, mage.cards.e.ErraticVisionary.class));
        cards.add(new SetCardInfo("Finale of Glory", 61, Rarity.MYTHIC, mage.cards.f.FinaleOfGlory.class));
        cards.add(new SetCardInfo("Fire Urchin", 133, Rarity.COMMON, mage.cards.f.FireUrchin.class));
        cards.add(new SetCardInfo("Firefist Striker", 134, Rarity.UNCOMMON, mage.cards.f.FirefistStriker.class));
        cards.add(new SetCardInfo("Firemane Avenger", 189, Rarity.RARE, mage.cards.f.FiremaneAvenger.class));
        cards.add(new SetCardInfo("Firespout", 190, Rarity.UNCOMMON, mage.cards.f.Firespout.class));
        cards.add(new SetCardInfo("Fleshbag Marauder", 111, Rarity.COMMON, mage.cards.f.FleshbagMarauder.class));
        cards.add(new SetCardInfo("Footlight Fiend", 191, Rarity.COMMON, mage.cards.f.FootlightFiend.class));
        cards.add(new SetCardInfo("Forbidden Alchemy", 86, Rarity.UNCOMMON, mage.cards.f.ForbiddenAlchemy.class));
        cards.add(new SetCardInfo("Forest", 270, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Frenzied Goblin", 135, Rarity.UNCOMMON, mage.cards.f.FrenziedGoblin.class));
        cards.add(new SetCardInfo("Fresh-Faced Recruit", 192, Rarity.COMMON, mage.cards.f.FreshFacedRecruit.class));
        cards.add(new SetCardInfo("Frostburn Weird", 193, Rarity.COMMON, mage.cards.f.FrostburnWeird.class));
        cards.add(new SetCardInfo("Fungal Rebirth", 163, Rarity.UNCOMMON, mage.cards.f.FungalRebirth.class));
        cards.add(new SetCardInfo("Giant Adephage", 164, Rarity.MYTHIC, mage.cards.g.GiantAdephage.class));
        cards.add(new SetCardInfo("Gift of Strength", 165, Rarity.COMMON, mage.cards.g.GiftOfStrength.class));
        cards.add(new SetCardInfo("Glorifier of Dusk", 62, Rarity.UNCOMMON, mage.cards.g.GlorifierOfDusk.class));
        cards.add(new SetCardInfo("Goblin Wizardry", 136, Rarity.COMMON, mage.cards.g.GoblinWizardry.class));
        cards.add(new SetCardInfo("Godless Shrine", 276, Rarity.RARE, mage.cards.g.GodlessShrine.class));
        cards.add(new SetCardInfo("Gods Willing", 63, Rarity.COMMON, mage.cards.g.GodsWilling.class));
        cards.add(new SetCardInfo("Golgari Guildgate", 235, Rarity.COMMON, mage.cards.g.GolgariGuildgate.class));
        cards.add(new SetCardInfo("Golgari Guildmage", 194, Rarity.UNCOMMON, mage.cards.g.GolgariGuildmage.class));
        cards.add(new SetCardInfo("Golgari Rot Farm", 236, Rarity.COMMON, mage.cards.g.GolgariRotFarm.class));
        cards.add(new SetCardInfo("Golgari Signet", 222, Rarity.COMMON, mage.cards.g.GolgariSignet.class));
        cards.add(new SetCardInfo("Gorging Vulture", 112, Rarity.COMMON, mage.cards.g.GorgingVulture.class));
        cards.add(new SetCardInfo("Gravel-Hide Goblin", 137, Rarity.COMMON, mage.cards.g.GravelHideGoblin.class));
        cards.add(new SetCardInfo("Gruul Guildgate", 237, Rarity.COMMON, mage.cards.g.GruulGuildgate.class));
        cards.add(new SetCardInfo("Gruul Signet", 223, Rarity.COMMON, mage.cards.g.GruulSignet.class));
        cards.add(new SetCardInfo("Gruul Turf", 238, Rarity.COMMON, mage.cards.g.GruulTurf.class));
        cards.add(new SetCardInfo("Gurmag Swiftwing", 113, Rarity.UNCOMMON, mage.cards.g.GurmagSwiftwing.class));
        cards.add(new SetCardInfo("Hall", 16, Rarity.UNCOMMON, mage.cards.h.Hall.class));
        cards.add(new SetCardInfo("Hallowed Fountain", 277, Rarity.RARE, mage.cards.h.HallowedFountain.class));
        cards.add(new SetCardInfo("Havoc Jester", 138, Rarity.UNCOMMON, mage.cards.h.HavocJester.class));
        cards.add(new SetCardInfo("Helium Squirter", 87, Rarity.COMMON, mage.cards.h.HeliumSquirter.class));
        cards.add(new SetCardInfo("Hydroid Krasis", 195, Rarity.MYTHIC, mage.cards.h.HydroidKrasis.class));
        cards.add(new SetCardInfo("Hypersonic Dragon", 196, Rarity.RARE, mage.cards.h.HypersonicDragon.class));
        cards.add(new SetCardInfo("Incriminating Impetus", 35, Rarity.UNCOMMON, mage.cards.i.IncriminatingImpetus.class));
        cards.add(new SetCardInfo("Incubation // Incongruity", 197, Rarity.UNCOMMON, mage.cards.i.IncubationIncongruity.class));
        cards.add(new SetCardInfo("Infest", 114, Rarity.UNCOMMON, mage.cards.i.Infest.class));
        cards.add(new SetCardInfo("Integrity // Intervention", 198, Rarity.UNCOMMON, mage.cards.i.IntegrityIntervention.class));
        cards.add(new SetCardInfo("Island", 258, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ivy Lane Denizen", 166, Rarity.COMMON, mage.cards.i.IvyLaneDenizen.class));
        cards.add(new SetCardInfo("Izzet Boilerworks", 239, Rarity.COMMON, mage.cards.i.IzzetBoilerworks.class));
        cards.add(new SetCardInfo("Izzet Guildgate", 240, Rarity.COMMON, mage.cards.i.IzzetGuildgate.class));
        cards.add(new SetCardInfo("Izzet Signet", 224, Rarity.COMMON, mage.cards.i.IzzetSignet.class));
        cards.add(new SetCardInfo("Jeering Homunculus", 88, Rarity.COMMON, mage.cards.j.JeeringHomunculus.class));
        cards.add(new SetCardInfo("Kitchen", 17, Rarity.UNCOMMON, mage.cards.k.Kitchen.class));
        cards.add(new SetCardInfo("Knife", 10, Rarity.UNCOMMON, mage.cards.k.Knife.class));
        cards.add(new SetCardInfo("Kraul Harpooner", 167, Rarity.UNCOMMON, mage.cards.k.KraulHarpooner.class));
        cards.add(new SetCardInfo("Kraul Warrior", 168, Rarity.COMMON, mage.cards.k.KraulWarrior.class));
        cards.add(new SetCardInfo("Krenko's Command", 139, Rarity.COMMON, mage.cards.k.KrenkosCommand.class));
        cards.add(new SetCardInfo("Kronch Wrangler", 169, Rarity.COMMON, mage.cards.k.KronchWrangler.class));
        cards.add(new SetCardInfo("Lavinia of the Tenth", 199, Rarity.RARE, mage.cards.l.LaviniaOfTheTenth.class));
        cards.add(new SetCardInfo("Lavinia, Foil to Conspiracy", 36, Rarity.RARE, mage.cards.l.LaviniaFoilToConspiracy.class));
        cards.add(new SetCardInfo("Law-Rune Enforcer", 64, Rarity.COMMON, mage.cards.l.LawRuneEnforcer.class));
        cards.add(new SetCardInfo("Lead Pipe", 9, Rarity.UNCOMMON, mage.cards.l.LeadPipe.class));
        cards.add(new SetCardInfo("Leapfrog", 89, Rarity.COMMON, mage.cards.l.Leapfrog.class));
        cards.add(new SetCardInfo("Library", 18, Rarity.UNCOMMON, mage.cards.l.Library.class));
        cards.add(new SetCardInfo("Light Up the Stage", 140, Rarity.UNCOMMON, mage.cards.l.LightUpTheStage.class));
        cards.add(new SetCardInfo("Lightning Bolt", 141, Rarity.UNCOMMON, mage.cards.l.LightningBolt.class));
        cards.add(new SetCardInfo("Living Lightning", 142, Rarity.UNCOMMON, mage.cards.l.LivingLightning.class));
        cards.add(new SetCardInfo("Lounge", 19, Rarity.UNCOMMON, mage.cards.l.Lounge.class));
        cards.add(new SetCardInfo("Martial Impetus", 65, Rarity.UNCOMMON, mage.cards.m.MartialImpetus.class));
        cards.add(new SetCardInfo("Masked Blackguard", 115, Rarity.COMMON, mage.cards.m.MaskedBlackguard.class));
        cards.add(new SetCardInfo("Master Biomancer", 200, Rarity.MYTHIC, mage.cards.m.MasterBiomancer.class));
        cards.add(new SetCardInfo("Mausoleum Turnkey", 116, Rarity.UNCOMMON, mage.cards.m.MausoleumTurnkey.class));
        cards.add(new SetCardInfo("Mighty Leap", 66, Rarity.COMMON, mage.cards.m.MightyLeap.class));
        cards.add(new SetCardInfo("Mountain", 266, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nissa's Judgment", 170, Rarity.UNCOMMON, mage.cards.n.NissasJudgment.class));
        cards.add(new SetCardInfo("Ornery Goblin", 143, Rarity.COMMON, mage.cards.o.OrneryGoblin.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 241, Rarity.COMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Orzhov Guildgate", 242, Rarity.COMMON, mage.cards.o.OrzhovGuildgate.class));
        cards.add(new SetCardInfo("Orzhov Guildmage", 201, Rarity.UNCOMMON, mage.cards.o.OrzhovGuildmage.class));
        cards.add(new SetCardInfo("Orzhov Racketeers", 117, Rarity.UNCOMMON, mage.cards.o.OrzhovRacketeers.class));
        cards.add(new SetCardInfo("Orzhov Signet", 225, Rarity.COMMON, mage.cards.o.OrzhovSignet.class));
        cards.add(new SetCardInfo("Oust", 67, Rarity.UNCOMMON, mage.cards.o.Oust.class));
        cards.add(new SetCardInfo("Overcome", 171, Rarity.UNCOMMON, mage.cards.o.Overcome.class));
        cards.add(new SetCardInfo("Overgrown Tomb", 278, Rarity.RARE, mage.cards.o.OvergrownTomb.class));
        cards.add(new SetCardInfo("Owl Familiar", 90, Rarity.COMMON, mage.cards.o.OwlFamiliar.class));
        cards.add(new SetCardInfo("Parasitic Impetus", 118, Rarity.COMMON, mage.cards.p.ParasiticImpetus.class));
        cards.add(new SetCardInfo("Parhelion Patrol", 68, Rarity.COMMON, mage.cards.p.ParhelionPatrol.class));
        cards.add(new SetCardInfo("Passwall Adept", 91, Rarity.COMMON, mage.cards.p.PasswallAdept.class));
        cards.add(new SetCardInfo("Pit Fight", 202, Rarity.COMMON, mage.cards.p.PitFight.class));
        cards.add(new SetCardInfo("Pitiless Gorgon", 203, Rarity.COMMON, mage.cards.p.PitilessGorgon.class));
        cards.add(new SetCardInfo("Plains", 254, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Predatory Impetus", 172, Rarity.COMMON, mage.cards.p.PredatoryImpetus.class));
        cards.add(new SetCardInfo("Psychic Impetus", 92, Rarity.UNCOMMON, mage.cards.p.PsychicImpetus.class));
        cards.add(new SetCardInfo("Pyrewild Shaman", 144, Rarity.UNCOMMON, mage.cards.p.PyrewildShaman.class));
        cards.add(new SetCardInfo("Rakdos Carnarium", 243, Rarity.COMMON, mage.cards.r.RakdosCarnarium.class));
        cards.add(new SetCardInfo("Rakdos Guildgate", 244, Rarity.COMMON, mage.cards.r.RakdosGuildgate.class));
        cards.add(new SetCardInfo("Rakdos Shred-Freak", 204, Rarity.COMMON, mage.cards.r.RakdosShredFreak.class));
        cards.add(new SetCardInfo("Rakdos Signet", 226, Rarity.COMMON, mage.cards.r.RakdosSignet.class));
        cards.add(new SetCardInfo("Rakdos Trumpeter", 119, Rarity.COMMON, mage.cards.r.RakdosTrumpeter.class));
        cards.add(new SetCardInfo("Rakdos, the Showstopper", 205, Rarity.MYTHIC, mage.cards.r.RakdosTheShowstopper.class));
        cards.add(new SetCardInfo("Rally to Battle", 69, Rarity.UNCOMMON, mage.cards.r.RallyToBattle.class));
        cards.add(new SetCardInfo("Rapid Hybridization", 93, Rarity.UNCOMMON, mage.cards.r.RapidHybridization.class));
        cards.add(new SetCardInfo("Reduce to Ashes", 145, Rarity.COMMON, mage.cards.r.ReduceToAshes.class));
        cards.add(new SetCardInfo("Repeal", 94, Rarity.COMMON, mage.cards.r.Repeal.class));
        cards.add(new SetCardInfo("Rescuer Sphinx", 95, Rarity.UNCOMMON, mage.cards.r.RescuerSphinx.class));
        cards.add(new SetCardInfo("Ribbons of Night", 120, Rarity.UNCOMMON, mage.cards.r.RibbonsOfNight.class));
        cards.add(new SetCardInfo("Ripscale Predator", 146, Rarity.COMMON, mage.cards.r.RipscalePredator.class));
        cards.add(new SetCardInfo("Roaming Ghostlight", 96, Rarity.COMMON, mage.cards.r.RoamingGhostlight.class));
        cards.add(new SetCardInfo("Roc Charger", 70, Rarity.UNCOMMON, mage.cards.r.RocCharger.class));
        cards.add(new SetCardInfo("Roofstalker Wight", 121, Rarity.COMMON, mage.cards.r.RoofstalkerWight.class));
        cards.add(new SetCardInfo("Rootborn Defenses", 71, Rarity.COMMON, mage.cards.r.RootbornDefenses.class));
        cards.add(new SetCardInfo("Sacred Foundry", 279, Rarity.RARE, mage.cards.s.SacredFoundry.class));
        cards.add(new SetCardInfo("Sage's Row Savant", 97, Rarity.COMMON, mage.cards.s.SagesRowSavant.class));
        cards.add(new SetCardInfo("Sauroform Hybrid", 173, Rarity.COMMON, mage.cards.s.SauroformHybrid.class));
        cards.add(new SetCardInfo("Scuttlegator", 206, Rarity.COMMON, mage.cards.s.Scuttlegator.class));
        cards.add(new SetCardInfo("Secret Passage", 20, Rarity.UNCOMMON, mage.cards.s.SecretPassage.class));
        cards.add(new SetCardInfo("Selesnya Guildgate", 245, Rarity.COMMON, mage.cards.s.SelesnyaGuildgate.class));
        cards.add(new SetCardInfo("Selesnya Guildmage", 207, Rarity.UNCOMMON, mage.cards.s.SelesnyaGuildmage.class));
        cards.add(new SetCardInfo("Selesnya Sanctuary", 246, Rarity.COMMON, mage.cards.s.SelesnyaSanctuary.class));
        cards.add(new SetCardInfo("Selesnya Signet", 227, Rarity.COMMON, mage.cards.s.SelesnyaSignet.class));
        cards.add(new SetCardInfo("Seller of Songbirds", 72, Rarity.COMMON, mage.cards.s.SellerOfSongbirds.class));
        cards.add(new SetCardInfo("Senator Peacock", 2, Rarity.RARE, mage.cards.s.SenatorPeacock.class));
        cards.add(new SetCardInfo("Seraph of the Scales", 208, Rarity.MYTHIC, mage.cards.s.SeraphOfTheScales.class));
        cards.add(new SetCardInfo("Shiny Impetus", 147, Rarity.UNCOMMON, mage.cards.s.ShinyImpetus.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", 247, Rarity.COMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Simic Guildgate", 248, Rarity.COMMON, mage.cards.s.SimicGuildgate.class));
        cards.add(new SetCardInfo("Simic Signet", 228, Rarity.COMMON, mage.cards.s.SimicSignet.class));
        cards.add(new SetCardInfo("Skitter Eel", 98, Rarity.COMMON, mage.cards.s.SkitterEel.class));
        cards.add(new SetCardInfo("Slip Out the Back", 99, Rarity.UNCOMMON, mage.cards.s.SlipOutTheBack.class));
        cards.add(new SetCardInfo("Sludge Titan", 43, Rarity.RARE, mage.cards.s.SludgeTitan.class));
        cards.add(new SetCardInfo("Snakeform", 209, Rarity.COMMON, mage.cards.s.Snakeform.class));
        cards.add(new SetCardInfo("Snow Day", 100, Rarity.UNCOMMON, mage.cards.s.SnowDay.class));
        cards.add(new SetCardInfo("Spawn of Mayhem", 122, Rarity.MYTHIC, mage.cards.s.SpawnOfMayhem.class));
        cards.add(new SetCardInfo("Spellgorger Weird", 148, Rarity.COMMON, mage.cards.s.SpellgorgerWeird.class));
        cards.add(new SetCardInfo("Status // Statue", 210, Rarity.UNCOMMON, mage.cards.s.StatusStatue.class));
        cards.add(new SetCardInfo("Steam Vents", 280, Rarity.RARE, mage.cards.s.SteamVents.class));
        cards.add(new SetCardInfo("Steeple Creeper", 174, Rarity.COMMON, mage.cards.s.SteepleCreeper.class));
        cards.add(new SetCardInfo("Stomping Ground", 281, Rarity.RARE, mage.cards.s.StompingGround.class));
        cards.add(new SetCardInfo("Stormblood Berserker", 149, Rarity.UNCOMMON, mage.cards.s.StormbloodBerserker.class));
        cards.add(new SetCardInfo("Street Spasm", 150, Rarity.UNCOMMON, mage.cards.s.StreetSpasm.class));
        cards.add(new SetCardInfo("Study", 21, Rarity.UNCOMMON, mage.cards.s.Study.class));
        cards.add(new SetCardInfo("Stunt Double", 101, Rarity.RARE, mage.cards.s.StuntDouble.class));
        cards.add(new SetCardInfo("Sunhome Stalwart", 73, Rarity.UNCOMMON, mage.cards.s.SunhomeStalwart.class));
        cards.add(new SetCardInfo("Supreme Verdict", 211, Rarity.RARE, mage.cards.s.SupremeVerdict.class));
        cards.add(new SetCardInfo("Swamp", 262, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Syndic of Tithes", 74, Rarity.COMMON, mage.cards.s.SyndicOfTithes.class));
        cards.add(new SetCardInfo("Syndicate Enforcer", 123, Rarity.COMMON, mage.cards.s.SyndicateEnforcer.class));
        cards.add(new SetCardInfo("Syndicate Heavy", 47, Rarity.RARE, mage.cards.s.SyndicateHeavy.class));
        cards.add(new SetCardInfo("Syndicate Messenger", 75, Rarity.COMMON, mage.cards.s.SyndicateMessenger.class));
        cards.add(new SetCardInfo("Tandem Tactics", 76, Rarity.COMMON, mage.cards.t.TandemTactics.class));
        cards.add(new SetCardInfo("Temple Garden", 282, Rarity.RARE, mage.cards.t.TempleGarden.class));
        cards.add(new SetCardInfo("Territorial Boar", 175, Rarity.COMMON, mage.cards.t.TerritorialBoar.class));
        cards.add(new SetCardInfo("Thief of Sanity", 212, Rarity.RARE, mage.cards.t.ThiefOfSanity.class));
        cards.add(new SetCardInfo("Thrashing Mossdog", 176, Rarity.COMMON, mage.cards.t.ThrashingMossdog.class));
        cards.add(new SetCardInfo("Thriving Bluff", 249, Rarity.COMMON, mage.cards.t.ThrivingBluff.class));
        cards.add(new SetCardInfo("Thriving Grove", 250, Rarity.COMMON, mage.cards.t.ThrivingGrove.class));
        cards.add(new SetCardInfo("Thriving Heath", 251, Rarity.COMMON, mage.cards.t.ThrivingHeath.class));
        cards.add(new SetCardInfo("Thriving Isle", 252, Rarity.COMMON, mage.cards.t.ThrivingIsle.class));
        cards.add(new SetCardInfo("Thriving Moor", 253, Rarity.COMMON, mage.cards.t.ThrivingMoor.class));
        cards.add(new SetCardInfo("Thunder Drake", 102, Rarity.COMMON, mage.cards.t.ThunderDrake.class));
        cards.add(new SetCardInfo("Tithebearer Giant", 124, Rarity.COMMON, mage.cards.t.TithebearerGiant.class));
        cards.add(new SetCardInfo("Towering Thunderfist", 151, Rarity.COMMON, mage.cards.t.ToweringThunderfist.class));
        cards.add(new SetCardInfo("Transluminant", 177, Rarity.COMMON, mage.cards.t.Transluminant.class));
        cards.add(new SetCardInfo("Trostani Discordant", 213, Rarity.MYTHIC, mage.cards.t.TrostaniDiscordant.class));
        cards.add(new SetCardInfo("Trusted Pegasus", 77, Rarity.COMMON, mage.cards.t.TrustedPegasus.class));
        cards.add(new SetCardInfo("Turn to Frog", 103, Rarity.UNCOMMON, mage.cards.t.TurnToFrog.class));
        cards.add(new SetCardInfo("Turn to Mist", 214, Rarity.COMMON, mage.cards.t.TurnToMist.class));
        cards.add(new SetCardInfo("Turret Ogre", 152, Rarity.COMMON, mage.cards.t.TurretOgre.class));
        cards.add(new SetCardInfo("Twilight Panther", 78, Rarity.COMMON, mage.cards.t.TwilightPanther.class));
        cards.add(new SetCardInfo("Undercover Butler", 49, Rarity.UNCOMMON, mage.cards.u.UndercoverButler.class));
        cards.add(new SetCardInfo("Underrealm Lich", 215, Rarity.MYTHIC, mage.cards.u.UnderrealmLich.class));
        cards.add(new SetCardInfo("Urbis Protector", 79, Rarity.UNCOMMON, mage.cards.u.UrbisProtector.class));
        cards.add(new SetCardInfo("Utvara Scalper", 153, Rarity.COMMON, mage.cards.u.UtvaraScalper.class));
        cards.add(new SetCardInfo("Venomous Hierophant", 125, Rarity.COMMON, mage.cards.v.VenomousHierophant.class));
        cards.add(new SetCardInfo("Vernadi Shieldmate", 216, Rarity.COMMON, mage.cards.v.VernadiShieldmate.class));
        cards.add(new SetCardInfo("Vernal Sovereign", 51, Rarity.RARE, mage.cards.v.VernalSovereign.class));
        cards.add(new SetCardInfo("Vindictive Vampire", 126, Rarity.UNCOMMON, mage.cards.v.VindictiveVampire.class));
        cards.add(new SetCardInfo("Vines of the Recluse", 178, Rarity.COMMON, mage.cards.v.VinesOfTheRecluse.class));
        cards.add(new SetCardInfo("Vizkopa Vampire", 217, Rarity.COMMON, mage.cards.v.VizkopaVampire.class));
        cards.add(new SetCardInfo("War Screecher", 80, Rarity.COMMON, mage.cards.w.WarScreecher.class));
        cards.add(new SetCardInfo("Watcher in the Mist", 104, Rarity.COMMON, mage.cards.w.WatcherInTheMist.class));
        cards.add(new SetCardInfo("Watery Grave", 283, Rarity.RARE, mage.cards.w.WateryGrave.class));
        cards.add(new SetCardInfo("Whisper Agent", 218, Rarity.COMMON, mage.cards.w.WhisperAgent.class));
        cards.add(new SetCardInfo("Wildsize", 179, Rarity.COMMON, mage.cards.w.Wildsize.class));
        cards.add(new SetCardInfo("Wildwood Patrol", 180, Rarity.COMMON, mage.cards.w.WildwoodPatrol.class));
        cards.add(new SetCardInfo("Wojek Bodyguard", 154, Rarity.COMMON, mage.cards.w.WojekBodyguard.class));
        cards.add(new SetCardInfo("Wrench", 7, Rarity.UNCOMMON, mage.cards.w.Wrench.class));
        cards.add(new SetCardInfo("Yeva's Forcemage", 181, Rarity.COMMON, mage.cards.y.YevasForcemage.class));
    }
}
