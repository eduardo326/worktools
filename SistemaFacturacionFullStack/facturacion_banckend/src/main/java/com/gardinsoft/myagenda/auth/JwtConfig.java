package com.gardinsoft.myagenda.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "esta.es.la.clave.secreta.123456789";
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEA7LY8BOUINoGNYyRPDbb164+X5RfgSCbKwRoi2ieewpVwp3vr\r\n" + 
			"dwTCEby32TxtYvmDJRI27PadiVlsx4nzkIXZ8cY1y5ljxSQFKUum7IA1jMPmgU9b\r\n" + 
			"BaqVQ/dhOzI4s5YCVhqcU93DEDzxQWUv01U5l9f9qYgxDZ3B/xj8jeYSiGuixz3g\r\n" + 
			"0pgVgOhrvB4376+0uuDp7nemslD8SrQSghBRXBGCugNeUbzr+5krxgfojMGpoUSd\r\n" + 
			"FgYjxST+Fq4WRFL+y6WCBsGZh+CQeuzT91O/IN5uYeACw2xXRNMxLReXYSeEJ+i0\r\n" + 
			"jQB1Tqa5GXii+th5hsXpUCYA/AWH20cKWgT3dwIDAQABAoIBAQCbpKeKQF5KGJ0y\r\n" + 
			"1yjzx52jqeMiS7S5PGiM1/aaovqMz14ngh+tPn+s0f3A5S63qYBF29gpr26eZSJV\r\n" + 
			"gauZF6nag43TtaQYeDq8kHXNg++yAw2JcPhUnXlQG1Tfa4JE8xnOK+kma+ZawveP\r\n" + 
			"HE16E8uuv+KWmmpGnbh1V6SYWPNOptOwYju2DLWdzPqTF9t1ojjLA4LIy/CRPgz/\r\n" + 
			"E+/cLHxkIQzf4641zuBWg5T73FRPi263x0usl+JBmBUSRRqWQJt8R+ZUhoIx+eDD\r\n" + 
			"BD9QHojPo6+GIJLRxvhiO++q68emhzSj9XoqF9IzrqffB0EeYZZ2gNkkTx98nTx8\r\n" + 
			"SMFEr5AhAoGBAPuIU30qy/CntFFXcm7XKwM7Ap5WSGmu4FRaGuB0jMyKnZeGaWfU\r\n" + 
			"3j567jhd1IsRZi/9jwenXNN6UZ/uiTt9gkGgSU18EN+ImwqAEt38x4gkwLFMyeVa\r\n" + 
			"AsF68X/ZbP8TzrNYeEZq2q/EHv6JElDTJDkOeMyH6JxiEhXdEoJAF2zrAoGBAPDq\r\n" + 
			"hXd++Ew7l1XrXqKjYUWbjPGHy6ms1OxMst2xbfxwImGtybzst2JzUDnqXf7DSi+Z\r\n" + 
			"K5g2lUOwZikUbnGg8RgO2RzGr+0b1ZtKQwD0gDuO5eBiMnVqlwf2k//xJdbC+yuR\r\n" + 
			"DGYOdbuWW++d+T9TMsL59PQRsKUw6ejlAkmGQkylAoGAE3N7YVaJ5tZRL2kfxEqH\r\n" + 
			"XPyXOz9Y4jNPzbYaFfltWfPuM+WFCS6A8Tv4aAt5gDecO2HUSbc7im8PGNsNabhO\r\n" + 
			"9lw6zu8lLuQVeT5mNxxxIaoV7KAPjNjlFak4O7bIowEZHu1cf7WLq8Py0aQv8mgh\r\n" + 
			"iPgBh2+LIWzEEUTDRadHKHkCgYEA6OYPeOHqL+g7+Pe9WQUQ+DXUH3rjzHgkrvvG\r\n" + 
			"vsLUTQIqeruDF3zQHADWQebsT2mDwlgU6OV7jyBs4rG5w2ePK27PPR5m3JXX/nPg\r\n" + 
			"KoAzp2ARosXLee89aplZokgCCIgeQJPMpKy97EcDQbY6SpmnrQ3vXDPtzQRoXJln\r\n" + 
			"iKSeW3ECgYBod5oam4SaC2DB/uLwZX9BOc4BR6igsP6i6IrRWFZOpgoos2IQ6G/b\r\n" + 
			"bggm9cA8AEsf2kFhrc32/NOoqhsGdCdpUScKGCN1Gu9quAeEgQ7DPSwYjWIe5S4x\r\n" + 
			"HcNXf/ffrWrkp/IdtCsjJZaB0/U70Q1w3tyKOMzkUcV0P0vKP4kkMw==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA ="-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7LY8BOUINoGNYyRPDbb1\r\n" + 
			"64+X5RfgSCbKwRoi2ieewpVwp3vrdwTCEby32TxtYvmDJRI27PadiVlsx4nzkIXZ\r\n" + 
			"8cY1y5ljxSQFKUum7IA1jMPmgU9bBaqVQ/dhOzI4s5YCVhqcU93DEDzxQWUv01U5\r\n" + 
			"l9f9qYgxDZ3B/xj8jeYSiGuixz3g0pgVgOhrvB4376+0uuDp7nemslD8SrQSghBR\r\n" + 
			"XBGCugNeUbzr+5krxgfojMGpoUSdFgYjxST+Fq4WRFL+y6WCBsGZh+CQeuzT91O/\r\n" + 
			"IN5uYeACw2xXRNMxLReXYSeEJ+i0jQB1Tqa5GXii+th5hsXpUCYA/AWH20cKWgT3\r\n" + 
			"dwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
