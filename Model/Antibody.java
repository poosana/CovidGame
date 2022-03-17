package Model;

public antibody(String name,String type, String geneticCode){
    super(name,type,geneticCode);


    switch (type) {
        case "A1" ->{
            this.maxHealth = config.A1Health;
            this.attackDamage = config.A1Damage;
            this.attackRange = config.A1AttackRange;

}
    }
    case "A2" ->{
        this.maxHealth = config.A2Health;
        this.attackDamage = config.A2Damage;
        this.attackRange = config.A2AttackRange;

}