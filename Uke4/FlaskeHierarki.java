

























class Emballasje {}

class Glassemballasje
    extends Emballasje {}

class Metallemballasje
    extends Emballasje {}

class Plastemballasje
    extends Emballasje {}

class Pappemballasje
    extends Emballasje {}

interface Pantbar {}

interface Nedbrytbar {}

class PlastflaskeMedPant
    implements Pantbar {}

class LitenPlastflaskeMedPant
    extends PlastflaskeMedPant {}

class LitenNedbrytbarPlastflaskeMedPant
    extends LitenPlastflaskeMedPant
    implements Nedbrytbar {}

class StorNedbrytbarPappflaskeMedPant
    extends Pappemballasje
    implements Nedbrytbar, Pantbar {}