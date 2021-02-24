# Projeto-Bootcamping-EverisKotlinDevelops-DIO

### Descrição do Projeto

> Aplicativo feito em Kotlin com os projetos Android propostos no Bootcamping everis Kotlin Develops da Digital Innovation One.

### Instalação

Para começar, inclua as seguintes dependências adicionando ao `build.gradle` do módulo do projeto e após isso atualize o `Gradle`:

```groovy
dependencies {
    //Implementação das bibliotecas usadas neste projeto
    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    implementation 'com.google.firebase:firebase-analytics:18.0.2'
    implementation 'com.google.firebase:firebase-messaging:21.0.1'
    implementation 'com.squareup.retrofit2:retrofit:2.5.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.1.0'
    implementation 'com.github.bumptech.glide:glide:4.7.1'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.7.1'
    implementation platform ('com.google.firebase:firebase-bom:26.3.0')
}
```
Depois, inclue a seguinte linha `build.gradle` no módulo do projeto e atualize o `Gradle`:

```groovy
dependencies {
    ...
    classpath 'com.google.gms:google-services:4.3.5'
    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle files
    }
```

Escreva as seguintes linhas no `Android Manifest`:

```xml
 <service
       android:name=".service.MyFirebaseMessagingService"
       android:enabled="true"
       android:exported="true">
       <intent-filter>
             <action android:name="com.google.firebase.MESSAGING_EVENT" />
       </intent-filter>
</service>
<service
      android:name=".service.MyFirebaseInstanceIdService"
      android:enabled="true"
      android:exported="true">
      <intent-filter>
              <action android:name="com.google.firebase.INSTANCE_ID_EVENT" />
      </intent-filter>
</service>
<provider
      android:name=".databases.NoteProvider"
      android:authorities="seu pacote.provider"
      android:enabled="true"
      android:exported="true" >
</provider>
```

### Telas do aplicativo 

A figura abaixo mostra as principais telas do aplicativo

|![](/app/src/main/java/chellotech/br/projeto_bootcamping_everiskotlindevelops_dio/screenshots/tela1.png) |![](/app/src/main/java/chellotech/br/projeto_bootcamping_everiskotlindevelops_dio/screenshots/tela2.png) |
|:---:|:---:|
| **Tela inicial do aplicativo** | **Tela Calculadora de Notas**  |
|![](/app/src/main/java/chellotech/br/projeto_bootcamping_everiskotlindevelops_dio/screenshots/tela3.png) |![](/app/src/main/java/chellotech/br/projeto_bootcamping_everiskotlindevelops_dio/screenshots/tela4.png))|
| **TELA COM A LISTA DE PESSOAS APÓS O CADASTRO**  |  **TELA COM A ÁREA DE ATUALIZAÇÃO DA PESSOA** |
|![](/app/src/main/java/chellotech/br/agendatelefonica/screenshots/permissao2.png) |![](/app/src/main/java/chellotech/br/agendatelefonica/screenshots/intent_pdf.png)  |
| **TELA DE PERMISSÃO DE ESCRITA DE DADOS ANTES DE GERAR O RELATÓRIO**  |  **TELA DE ESCOLHA DE APLICATIVO COMPATÍVEL COM O FORMATO PDF** |
|![](/app/src/main/java/chellotech/br/agendatelefonica/screenshots/relatorio_pessoas.png) 
| **RELATÓRIO GERADO**  


