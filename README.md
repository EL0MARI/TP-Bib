📚 TP – Modélisation d’une bibliothèque en Java
🎯 Objectif
Ce projet est un TP universitaire visant à modéliser une petite bibliothèque municipale en Java. Il met en pratique plusieurs concepts de la programmation orientée objet :

Création d’objets-valeur immuables (Isbn, Email)

Validation des invariants (ISBN valide, email correct, date d’inscription non future…)

Encapsulation des collections dans la classe Library

Utilisation des records et des enums modernes en Java

Gestion des emprunts avec transitions de statut (ONGOING, RETURNED, LATE)

🏗️ Structure du projet
Isbn et Email : objets-valeur immuables avec validation

Book : représente un livre

Member : représente un adhérent

LoanStatus : enum pour les états d’un emprunt

Loan : représente un emprunt avec logique de retard

Library : encapsule les collections et fournit les opérations principales

Main : exemple d’utilisation et tests simples

🚀 Exécution
Pour tester rapidement :

bash
javac *.java
java Main
Le programme affiche la création d’un livre, d’un membre et d’un emprunt, puis met à jour le statut.

✅ Ce que j’ai appris
Comment créer des objets immuables en Java avec record.

L’importance de valider les données dès la construction des objets.

Comment protéger les collections internes avec Collections.unmodifiableList.

Que les enums peuvent contenir des comportements utiles, pas seulement des constantes.

La modélisation objet permet de traduire un système réel (bibliothèque) en classes claires et cohérentes.

📌 Conclusion
Ce TP m’a permis de renforcer ma compréhension de la programmation orientée objet en Java. Le projet est simple mais extensible, et peut servir de base pour une application de gestion de bibliothèque plus complète.
